package com.example.learndagger

import com.example.learndagger.Ui.MainActivity
import com.example.learndagger.Ui.MainActivityViewModel
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB

class DependancyComponent {
   /* companion object {
        fun inject(application: MyApplication){
            application.netWorkService= NetWorkService(application, "API")
            application.roomDB= RoomDB(application,"MyDB",1)
        }

        fun inject(mainActivity: MainActivity){
            val app:MyApplication = mainActivity.application as MyApplication
            mainActivity.mainViewModel= MainActivityViewModel(app.netWorkService,app.roomDB)
        }

    }*/

}