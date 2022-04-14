package com.example.learndagger.Ui

import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB

class MainActivityViewModel(netWorkService: NetWorkService,roomDB: RoomDB) {
    val netWorkService=netWorkService
    val roomDB=roomDB
    fun getData():String{
        return netWorkService.getDummyData() +" "+roomDB.getDummyData()
    }
}