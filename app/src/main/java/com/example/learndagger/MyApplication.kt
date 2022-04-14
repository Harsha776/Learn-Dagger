package com.example.learndagger

import android.app.Application
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB

class MyApplication : Application() {

    lateinit var netWorkService: NetWorkService
    lateinit var roomDB: RoomDB
    override fun onCreate() {
        super.onCreate()
        DependancyComponent.inject(this)
    }
}