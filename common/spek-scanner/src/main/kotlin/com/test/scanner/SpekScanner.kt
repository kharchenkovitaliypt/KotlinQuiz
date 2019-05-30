package com.test.scanner

import com.google.auto.service.AutoService
import com.test.annotation.SpekEngine
import java.io.File
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.Element
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic

private const val KAPT_KOTLIN_GENERATED_OPTION_NAME = "kapt.kotlin.generated"

@AutoService(Processor::class) // For registering the service
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedOptions(KAPT_KOTLIN_GENERATED_OPTION_NAME)
class SpekScanner : AbstractProcessor() {

    data class ClassInfo(val name: String, val packageName: String)

    override fun getSupportedSourceVersion() = SourceVersion.latest()!!

    override fun getSupportedAnnotationTypes() = mutableSetOf(SpekEngine::class.java.name)

    override fun process(set: MutableSet<out TypeElement>, roundEnv: RoundEnvironment): Boolean {
        if(roundEnv.processingOver()) {
            return true
        }
        val specs = roundEnv.getElementsAnnotatedWith(SpekEngine::class.java)
            .map { ClassInfo(it.simpleName.toString(), it.packageName) }

        writeToKaptFle("Specs.kt", generateSpecsContent(specs))

        return true
    }

    private val Element.packageName: String get() =
        processingEnv.elementUtils.getPackageOf(this).toString()

    private fun generateSpecsContent(specs: List<ClassInfo>): String {
        val packageName = "io.github.classgraph"

        return buildString {
            append("package $packageName")
            newLine(2)

            specs.forEach {
                append("import ${it.packageName}.${it.name}")
                newLine()
            }
            newLine()

            append("val specs = listOf(")
            newLine()
            specs.joinTo(this, separator = ", \n") {
                "    " + it.name + "::class"
            }
            newLine()
            append(")")
        }
    }

    private fun writeToKaptFle(name: String, content: String) {
        val outputDir = processingEnv.options[KAPT_KOTLIN_GENERATED_OPTION_NAME]
        File(outputDir, name).writeText(content)
    }
}

fun StringBuilder.newLine(number: Int = 1): StringBuilder {
    repeat(number) { append("\n") }
    return this
}