package com.code.hub.course

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ShowNowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val imgProgram: ImageView
    private val txtTimestamp: TextView
    private val txtProgramName: TextView

    init {
        imgProgram = itemView.findViewById(R.id.holder_image)
        txtTimestamp = itemView.findViewById(R.id.holder_timestamp)
        txtProgramName = itemView.findViewById(R.id.holder_program)
    }

    fun bind(data: ChannelResponse, timestamp: Long) {

        data.getNow(timestamp)?.apply {
            txtProgramName.text = this.title
            Glide.with(itemView.context).load(UiUtils.getChannelIconRes(data.channelName))
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(imgProgram);


//            imgProgram.setImageResource()

            txtTimestamp.text = this.startTimeCaption + "\n" + this.endTimeCaption
            txtTimestamp.text = "${this.startTime}\n${this.endTimeCaption}"
            txtTimestamp.text = String.format("%s\n%s", this.startTimeCaption, this.endTimeCaption)
            txtTimestamp.text = StringBuilder(this.startTimeCaption).append("\n").append(this.endTimeCaption)
        }
    }
}