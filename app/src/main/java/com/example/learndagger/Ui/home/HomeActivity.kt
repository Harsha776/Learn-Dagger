package com.example.learndagger.Ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learndagger.MyApplication
import com.example.learndagger.R
import com.example.learndagger.di.components.ApplicationComponents
import com.example.learndagger.di.components.DaggerHomeActivityComponents
import com.example.learndagger.di.components.HomeActivityComponents
import com.example.learndagger.di.modules.HomeActicityModule
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        DaggerHomeActivityComponents.builder().applicationComponents((application as MyApplication).applicationComponents)
            .homeActicityModule(HomeActicityModule())
            .build()
    }
}