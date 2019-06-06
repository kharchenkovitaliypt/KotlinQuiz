@file:Suppress("UNUSED_PARAMETER")

package io.github.classgraph

import com.test.kotlinquiz.service.specs
import java.io.Closeable

/**
 * The result of a scan. You should assign a ScanResult in a try-with-resources block, or manually close it when you
 * have finished with the result of a scan.
 */
class ScanResult : Closeable, AutoCloseable {

    fun getSubclasses(superclassName: String): ClassInfoList =
        specs.fold(ClassInfoList()) { list, clazz ->
            list += ClassInfo(clazz.java)
            list
        }

    override fun close() { }
}