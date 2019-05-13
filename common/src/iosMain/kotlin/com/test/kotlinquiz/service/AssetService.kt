package com.test.kotlinquiz.service

import com.test.kotlinquiz.coroutines.suspendJob
import platform.Foundation.NSBundle
import platform.Foundation.NSString
import platform.Foundation.stringWithContentsOfFile

class AssetServiceImpl : AssetService {

    override suspend fun fetch(name: String): String = suspendJob {
        val path = NSBundle.mainBundle().pathForResource(name, null)
        NSString.stringWithContentsOfFile(path!!) as String
    }
}

//fun open(name: String): Input {
//    val filePath = NSBundle.mainBundle().pathForResource(name, ofType = "json")!!
//    val pointer = NSFileManager.defaultManager.fileSystemRepresentationWithPath(filePath) as CPointer<FILE>
//    return Input(pointer)
//}