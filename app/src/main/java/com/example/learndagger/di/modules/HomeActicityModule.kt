package com.example.learndagger.di.modules

import com.example.learndagger.Ui.home.HomeViewModel
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB
import dagger.Component
import dagger.Module
import dagger.Provides

@Module
class HomeActicityModule {

    @Provides
    fun getHomeViewModel(netWorkService: NetWorkService,roomDB: RoomDB):HomeViewModel{
        return HomeViewModel(netWorkService,roomDB)
    }
}