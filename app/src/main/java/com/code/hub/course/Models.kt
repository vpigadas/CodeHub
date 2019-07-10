package com.code.hub.course

import java.util.*

data class ChannelsResponse(val channels: List<ChannelResponse>)

data class ChannelResponse(
    val channelName: String,
    val shows: List<ShowResponse>
) {
    fun getNow(currentTimestamp:Long): ShowResponse? {
        shows.forEach {
            if (currentTimestamp > it.startTime && currentTimestamp < it.endTime) {
                return it
            }
        }

        return null
    }
}


data class ShowResponse(
    val title: String,
    val startTimeCaption: String,
    val endTimeCaption: String,
    var startTime: Long = -1,
    var endTime: Long = -1
)