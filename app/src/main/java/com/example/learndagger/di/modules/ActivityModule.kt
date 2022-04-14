package com.example.learndagger.di.modules

import com.example.learndagger.Ui.MainActivity
import com.example.learndagger.Ui.MainActivityViewModel
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule(mainActivity: MainActivity) {
    val mainActivity=mainActivity

    @Provides
    fun provideViewModel(netWorkService: NetWorkService,roomDB: RoomDB):MainActivityViewModel{
        return MainActivityViewModel(netWorkService,roomDB)
    }

}