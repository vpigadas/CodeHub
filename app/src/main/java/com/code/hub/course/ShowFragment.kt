package com.code.hub.course

import android.content.Intent
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView

class ShowFragment : MyFragment(), ShowProgramDelegate {

    private val stream: MutableLiveData<ChannelsResponse> = MutableLiveData()
    private lateinit var recyclerView: RecyclerView

    companion object {
        fun newInstance() = ShowFragment()
    }

    override fun getLayoutRes(): Int = R.layout.fragment_show

    override fun initUI(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)

        val adapter = ShowNowAdapter(this)
        recyclerView?.adapter = adapter

    }

    override fun refreshUI(view: View) {
        stream.observe(this, androidx.lifecycle.Observer { response ->
            val adapter = recyclerView.adapter
            if (adapter is ShowNowAdapter) {
                adapter.updateData(response.channels)
            }
        })
        ApiCLient().getTvProgram(stream)
    }

    override fun destroyUI(view: View) {
        stream.removeObservers(this)

        super.destroyUI(view)
    }

    override fun onclickAction(view: View) {
        val position = recyclerView.getChildAdapterPosition(view)
        val adapter = recyclerView.adapter
        if (adapter is ShowNowAdapter) {
            val data = adapter.getItem(position)

            startActivity(Intent(context, DetailsActivity::class.java))

//            Snackbar.make(view, "$data", Snackbar.LENGTH_SHORT).show()
//            Toast.makeText(view.context, "Hello World", Toast.LENGTH_SHORT).show()
        }

    }
}
