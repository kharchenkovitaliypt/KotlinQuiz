package com.test.kotlinquiz.service

import platform.Foundation.NSBundle
import platform.Foundation.NSString
import platform.Foundation.stringWithContentsOfFile

actual class AssetService {

    actual suspend fun fetch(name: String): String {
        val path = NSBundle.mainBundle().pathForResource(name, null)
        return NSString.stringWithContentsOfFile(path!!) as String
    }
}

//fun open(name: String): Input {
//    val filePath = NSBundle.mainBundle().pathForResource(name, ofType = "json")!!
//    val pointer = NSFileManager.defaultManager.fileSystemRepresentationWithPath(filePath) as CPointer<FILE>
//    return Input(pointer)
//}