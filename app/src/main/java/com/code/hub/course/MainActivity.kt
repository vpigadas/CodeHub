package com.code.hub.course

import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
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

        val recyclerView: RecyclerView? = findViewById(R.id.recyclerView)

        val adapter = ShowNowAdapter(this)
        adapter.updateData(
            listOf(
                ShowNowProgram("ONE", "ONE", "ONE"),
                ShowNowProgram("TWO", "TWO", "TWO"),
                ShowNowProgram("THREE", "THREE", "THREE"),
                ShowNowProgram("FOUR", "FOUR", "FOUR"),
                ShowNowProgram("FiVE", "FiVE", "FiVE")
            )
        )

        recyclerView?.adapter = adapter


//        toolbar?.let {
//            it.setTitle(R.string.app_name)
//            it.setSubtitle("My name is George")
//        }

//        toolbar?.setTitle("Hello Wolrd!!")
//        toolbar?.setTitle(R.string.app_name)

//        toolbar?.setSubtitle("My name is Vassilis")

//        val toolbar1 = findViewById<Toolbar?>(R.id.toolbar)
    }

    override fun refreshUI() {}
}
