package com.example.learndagger.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.learndagger.DependancyComponent
import com.example.learndagger.R

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel:MainActivityViewModel

    lateinit var tvText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DependancyComponent.inject(this)
        tvText=findViewById(R.id.tvText)
        tvText.setText(mainViewModel.getData())
    }
}