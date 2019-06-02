@file:JvmName("ClassGraph")
@file:Suppress("UNUSED_PARAMETER")

package io.github.classgraph

class ClassGraph {

    fun overrideClasspath(elements: Iterable<*>): ClassGraph = this

    fun enableClassInfo(): ClassGraph = this

    fun scan() = ScanResult()
}
