package com.example.learndagger.Ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndagger.MyApplication
import com.example.learndagger.R
import com.example.learndagger.Ui.base.BaseActivity
import com.example.learndagger.di.components.ActivityComponents
import com.example.learndagger.di.components.ApplicationComponents
import com.example.learndagger.di.components.DaggerHomeActivityComponents
import com.example.learndagger.di.components.HomeActivityComponents
import com.example.learndagger.di.modules.HomeActicityModule
import javax.inject.Inject

class HomeActivity : BaseActivity<HomeViewModel>() {


    @Inject lateinit var homeViewModel: HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun injectDependencies(activityComponent: ActivityComponents) {
       activityComponent.inject(this)
    }

    override fun provideLayoutId(): Int = R.layout.activity_home
}