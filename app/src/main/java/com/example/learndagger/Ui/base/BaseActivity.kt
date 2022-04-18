package com.example.learndagger.Ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learndagger.MyApplication
import com.example.learndagger.di.components.ActivityComponents
import com.example.learndagger.di.components.DaggerActivityComponents
import com.example.learndagger.di.modules.ActivityModule
import javax.inject.Inject

abstract class BaseActivity<VM :BaseViewModel>:AppCompatActivity() {

    @Inject lateinit var viewModel: VM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies(provideInstance())
        setContentView(provideLayoutId())
    }

    private fun provideInstance()=
        DaggerActivityComponents
            .builder()
            .applicationComponents((application as MyApplication).applicationComponents)
            .activityModule(ActivityModule(this))
            .build()


    protected abstract fun injectDependencies(activityComponent: ActivityComponents)

    protected abstract fun provideLayoutId(): Int
}