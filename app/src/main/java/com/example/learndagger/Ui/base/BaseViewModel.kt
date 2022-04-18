package com.example.learndagger.Ui.base

import androidx.lifecycle.ViewModel
import com.example.learndagger.Ui.netWork.NetWorkService
import com.example.learndagger.Ui.room.RoomDB

abstract class BaseViewModel(netWorkService: NetWorkService,roomDB: RoomDB):ViewModel() {
}