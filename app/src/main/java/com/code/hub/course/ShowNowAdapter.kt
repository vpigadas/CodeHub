package com.code.hub.course

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ShowNowAdapter(activitiy: MainActivity) : RecyclerView.Adapter<ShowNowViewHolder>() {
    var arrayData: List<ShowNowProgram> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowNowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_show_now, parent, false)
        view.setOnClickListener { }
        return ShowNowViewHolder(view)
    }

    fun updateData(data: List<ShowNowProgram>) {
        arrayData = data
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = arrayData.size

    fun getItem(position: Int): ShowNowProgram = arrayData[position]

    override
    fun onBindViewHolder(holder: ShowNowViewHolder, position: Int) {
        val data = getItem(position)

        holder.bind(data.toString())
    }

}
