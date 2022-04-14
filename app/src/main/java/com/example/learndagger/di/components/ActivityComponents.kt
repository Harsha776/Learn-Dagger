package com.example.learndagger.di.components

import android.app.Activity
import com.example.learndagger.Ui.MainActivity
import com.example.learndagger.di.modules.ActivityModule
import com.example.learndagger.di.modules.ApplicationModule
import com.example.learndagger.di.scope.ActivityScope
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [ApplicationComponents::class],modules = [ActivityModule::class])
interface ActivityComponents {

    fun inject(activity: MainActivity)
}