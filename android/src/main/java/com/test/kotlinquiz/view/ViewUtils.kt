package com.test.kotlinquiz.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

val View.inflater: LayoutInflater get() = LayoutInflater.from(context)

@Suppress("UNCHECKED_CAST")
fun <V> ViewGroup.inflate(
    @LayoutRes layoutId: Int,
    configure: V.() -> Unit = {}
): V {
    val view = inflater.inflate(layoutId, this, false) as V
    view.apply(configure)
    return view
}

fun <V: View> ViewGroup.addView(
    @LayoutRes layoutId: Int,
    configure: V.() -> Unit
): V {
    val view: V = inflate(layoutId, configure)
    addView(view)
    return view
}