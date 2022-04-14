package com.example.learndagger.Ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.learndagger.MyApplication
import com.example.learndagger.R
import com.example.learndagger.di.components.DaggerActivityComponents
import com.example.learndagger.di.modules.ActivityModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject lateinit var mainViewModel:MainActivityViewModel

    lateinit var tvText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //DependancyComponent.inject(this)
        DaggerActivityComponents.builder()
            .applicationComponents((application as MyApplication).applicationComponents )
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
        tvText=findViewById(R.id.tvText)
        tvText.setText(mainViewModel.getData())
    }
}