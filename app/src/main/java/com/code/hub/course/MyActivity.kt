package com.code.hub.course

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
    }

    abstract fun getLayoutRes(): Int

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        initUI()
    }

    abstract fun initUI()

    override fun onPostResume() {
        super.onPostResume()

        refreshUI()
    }

    abstract fun refreshUI()

    override fun onStop() {
        destroyUI()

        super.onStop()
    }

    open fun destroyUI(){

    }
}