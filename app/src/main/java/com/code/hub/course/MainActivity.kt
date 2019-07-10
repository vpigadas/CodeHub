package com.code.hub.course

import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : MyActivity() {
    private val stream: MutableLiveData<ChannelsResponse> = MutableLiveData()
    private lateinit var recyclerView: RecyclerView

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

        recyclerView = findViewById(R.id.recyclerView)

        val adapter = ShowNowAdapter(this)

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

    override fun refreshUI() {
        stream.observe(this, androidx.lifecycle.Observer { response ->
            val adapter = recyclerView.adapter
            if(adapter is ShowNowAdapter){
                adapter.updateData(response.channels)
            }
        })
        ApiCLient().getTvProgram(stream)
    }

    override fun destroyUI() {
        stream.removeObservers(this)
        super.destroyUI()
    }
}
