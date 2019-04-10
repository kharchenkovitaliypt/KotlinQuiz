package com.test.kotlinquiz.view

import android.content.Context
import android.view.Gravity
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.test.kotlinquiz.R

fun FragmentManager.removeById(viewId: Int) {
    findFragmentById(R.id.container)!!.let { fragment ->
        transact { remove(fragment) }
    }
}

fun FragmentManager.replace(viewId: Int, fragment: Fragment) {
    transact { replace(viewId, fragment) }
}

fun FragmentManager.transact(block: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction()
        .run(block)
        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        .commit()
}

fun Context.showMessage(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).apply {
        setGravity(Gravity.BOTTOM, xOffset, yOffset + 200)
        show()
    }
}