package com.code.hub.course

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.core.isClientError
import com.github.kittinunf.fuel.core.isServerError
import com.github.kittinunf.fuel.core.isSuccessful
import com.github.kittinunf.fuel.gson.responseObject

class ApiCLient {

    init {
        FuelManager.instance.apply {
            baseHeaders = mapOf()
            basePath = "https://tv-zapping.herokuapp.com"
        }
    }

    fun getTvProgram(stream: MutableLiveData<ChannelsResponse>) {
        Fuel.get("/v2/tv/").responseObject<ChannelsResponse> { request, response, result ->
            when {
                response.isSuccessful -> {
                    result.fold(success = { data ->
                        stream.postValue(data)
                    }, failure = { exception ->
                        if (BuildConfig.DEBUG) {
                            exception.cause?.printStackTrace()
                        }
                    })
                }
                response.isServerError || response.isClientError -> {
                    if (BuildConfig.DEBUG) {
                        Log.e("ApiCLient", response.body().toString())
                    }
                }
            }
        }
    }

}