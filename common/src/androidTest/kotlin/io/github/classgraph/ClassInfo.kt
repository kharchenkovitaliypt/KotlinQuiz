package io.github.classgraph

class ClassInfo(private val clazz: Class<*>) {

    fun loadClass(): Class<*> = clazz
}
