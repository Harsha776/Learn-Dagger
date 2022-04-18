package com.example.learndagger.di.modules



import androidx.lifecycle.ViewModelProviders
import com.example.learndagger.Ui.MainActivity
import com.example.learndagger.Ui.MainActivityViewModel
import com.example.learndagger.Ui.base.BaseActivity
import com.example.learndagger.Ui.base.BaseViewModel
import com.example.learndagger.Ui.home.HomeViewModel
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB
import com.mindorks.bootcamp.instagram.utils.ViewModelProviderFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule(mainActivity: BaseActivity<*>) {
    val mainActivity=mainActivity

    @Provides
    fun provideViewModel(netWorkService: NetWorkService,roomDB: RoomDB):MainActivityViewModel{
        return ViewModelProviders.of(mainActivity,ViewModelProviderFactory(MainActivityViewModel::class){
            MainActivityViewModel(netWorkService,roomDB)
        }).get(MainActivityViewModel::class.java)
    }

    @Provides
    fun provideHomeViewModel(netWorkService: NetWorkService,roomDB: RoomDB):HomeViewModel{
        return ViewModelProviders.of(mainActivity,ViewModelProviderFactory(HomeViewModel::class){
            HomeViewModel(netWorkService,roomDB)
        }).get(HomeViewModel::class.java)
    }

}