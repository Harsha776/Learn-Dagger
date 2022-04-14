package com.example.learndagger.di.components

import com.example.learndagger.MyApplication
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB
import com.example.learndagger.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules=[ApplicationModule::class])
interface ApplicationComponents {

    fun inject(myApplication: MyApplication)

    fun getNetworkService():NetWorkService

    fun getRoomService():RoomDB
}