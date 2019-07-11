package com.code.hub.course

import androidx.appcompat.widget.Toolbar
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : MyActivity() {
    override fun getLayoutRes(): Int  = R.layout.activity_main

    override fun initUI() {
        val toolbar: Toolbar? = findViewById(R.id.toolbar)

        toolbar?.apply {
            var dateTime: String = SimpleDateFormat(
                "EEEE dd, MM yyyy",
                Locale.getDefault()
            ).format(Date())

            setTitle(dateTime)
        }

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, ShowFragment.newInstance(), ShowFragment::class.java.simpleName)
        fragmentTransaction.commit()
    }

    override fun refreshUI() {

    }
}
