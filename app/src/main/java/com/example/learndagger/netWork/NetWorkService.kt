package com.example.learndagger.Ui.netWork

import android.content.Context
import com.example.learndagger.di.scope.NetWorkInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetWorkService @Inject constructor(context: Context, @NetWorkInfo apiKey: String) {
    val context=context
    val apiKey=apiKey

    fun getDummyData():String{
        return "Dummy APi"
    }
}