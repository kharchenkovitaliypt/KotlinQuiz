package io.github.classgraph

import java.io.Closeable

/**
 * The result of a scan. You should assign a ScanResult in a try-with-resources block, or manually close it when you
 * have finished with the result of a scan.
 */
class ScanResult : Closeable, AutoCloseable {

    fun getSubclasses(superclassName: String) =
        specs.fold(ClassInfoList()) { list, clazz ->
            list += ClassInfo(clazz.java)
            list
        }

    override fun close() { }
}