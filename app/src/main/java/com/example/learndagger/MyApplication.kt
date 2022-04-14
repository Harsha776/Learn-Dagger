package com.example.learndagger

import android.app.Application
import android.util.Log
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB
import com.example.learndagger.di.components.ApplicationComponents
import com.example.learndagger.di.components.DaggerApplicationComponents
import com.example.learndagger.di.modules.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {
    lateinit var applicationComponents:ApplicationComponents
    @Inject lateinit var netWorkService: NetWorkService
    @Inject lateinit var roomDB: RoomDB
    override fun onCreate() {
        super.onCreate()
        applicationComponents= DaggerApplicationComponents.builder()
            .applicationModule(ApplicationModule(this))
            .build()

        applicationComponents.inject(this)
        Log.d("TAG", "onCreate: ")
    }
}