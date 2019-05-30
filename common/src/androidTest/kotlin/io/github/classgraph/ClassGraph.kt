@file:JvmName("ClassGraph")

package io.github.classgraph

class ClassGraph {

    fun enableClassInfo(): ClassGraph = this

    fun scan() = ScanResult()
}
