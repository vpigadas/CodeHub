package com.code.hub.course

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShowNowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(data: String) {
        itemView.findViewById<TextView?>(R.id.holder_program)?.text = data
    }
}