package com.example.learndagger.Ui.netWork

import android.content.Context

class NetWorkService(context: Context,apiKey: String) {
    val context=context
    val apiKey=apiKey

    fun getDummyData():String{
        return "Dummy APi"
    }
}