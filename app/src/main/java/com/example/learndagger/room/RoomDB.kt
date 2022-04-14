package com.example.learndagger.Ui.room

import android.content.Context

class RoomDB(context: Context,dataBaseName: String,version:Int) {
    val context:Context = context
    val dataBaseName:String=dataBaseName
    val version:Int = version

    fun getDummyData():String{
        return "Dummy Data"
    }
}