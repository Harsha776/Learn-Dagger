package com.example.learndagger.Ui

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.learndagger.MyApplication
import com.example.learndagger.R
import com.example.learndagger.Ui.adapter.CustomView
import com.example.learndagger.Ui.base.BaseActivity
import com.example.learndagger.Ui.home.HomeActivity
import com.example.learndagger.di.components.ActivityComponents
import com.example.learndagger.di.components.DaggerActivityComponents
import com.example.learndagger.di.modules.ActivityModule
import javax.inject.Inject


class MainActivity : BaseActivity<MainActivityViewModel>() {
    @Inject lateinit var homeViewModel:MainActivityViewModel
    @Inject lateinit var adapter: CustomView


    lateinit var tvText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //DependancyComponent.inject(this)
        tvText=findViewById(R.id.tvText)
        val recyclerview = findViewById<RecyclerView>(R.id.rvAdapter)
        val data = ArrayList<String>()
        data.add("Harsha")
        data.add("baby")

        recyclerview.adapter = adapter
        adapter.setData(data)
        tvText.setText(homeViewModel.getData())

        tvText.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

    }

    override fun injectDependencies(activityComponent: ActivityComponents) {
        activityComponent.inject(this)
    }

    override fun provideLayoutId(): Int =R.layout.activity_main
}
