package com.code.hub.course

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ShowNowAdapter(activitiy: MainActivity) : RecyclerView.Adapter<ShowNowViewHolder>() {

    private var currentTimestamp: Long

    init {
        val calendar = Calendar.getInstance(Locale("el", "GR"))
        val hours = calendar.get(Calendar.HOUR)
        val minutes = calendar.get(Calendar.MINUTE)

        currentTimestamp = (minutes + (60 * hours)).toLong()
        if (hours > 12) {
            currentTimestamp = currentTimestamp + 24 * 60
        }
    }

    var arrayData: List<ChannelResponse> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowNowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_show_now, parent, false)
        view.setOnClickListener { }
        return ShowNowViewHolder(view)
    }

    fun updateData(data: List<ChannelResponse>) {
        arrayData = data

        val calendar = Calendar.getInstance(Locale("el", "GR"))
        val hours = calendar.get(Calendar.HOUR)
        val minutes = calendar.get(Calendar.MINUTE)

        currentTimestamp = (minutes + (60 * hours)).toLong()
        if (hours > 12) {
            currentTimestamp = currentTimestamp + 24 * 60
        }
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = arrayData.size

    fun getItem(position: Int): ChannelResponse = arrayData[position]

    override
    fun onBindViewHolder(holder: ShowNowViewHolder, position: Int) {
        val data = getItem(position)

        holder.bind(data, currentTimestamp)
    }

}
