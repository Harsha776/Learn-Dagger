package com.example.learndagger.Ui.home

import com.example.learndagger.Ui.base.BaseViewModel
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB
import javax.inject.Inject

class HomeViewModel (netWorkService: NetWorkService,roomDB: RoomDB) :
BaseViewModel(netWorkService,roomDB){

}