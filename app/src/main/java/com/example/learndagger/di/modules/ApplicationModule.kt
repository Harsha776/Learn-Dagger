package com.example.learndagger.di.modules

import android.content.Context
import com.example.learndagger.MyApplication
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB
import com.example.learndagger.di.scope.DataBaseString
import com.example.learndagger.di.scope.NetWorkInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(myApplication: MyApplication) {
    val myApplication=myApplication

    @Provides
    fun getContext():Context{
        return myApplication
    }

    @DataBaseString
    @Provides
    fun getString():String{
        return "myApplication"
    }
    @Provides
    fun getInt():Int{
        return 1
    }

    @NetWorkInfo
    @Provides
    fun getString1():String{
        return "myApplication"
    }
    /*@Singleton
    @Provides
    fun provideNetworkSerive():NetWorkService{
        return NetWorkService(myApplication, "API")
    }

    @Singleton
    @Provides
    fun provideRoomDB():RoomDB{
        return RoomDB(myApplication,"MyDB",1)
    }*/
}