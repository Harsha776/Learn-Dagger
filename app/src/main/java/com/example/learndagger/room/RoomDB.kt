package com.example.learndagger.Ui.room

import android.content.Context
import com.example.learndagger.di.scope.DataBaseString
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RoomDB @Inject constructor(context: Context, @DataBaseString dataBaseName: String, version:Int) {
    val context:Context = context
    val dataBaseName:String=dataBaseName
    val version:Int = version

    fun getDummyData():String{
        return "Dummy Data"
    }
}