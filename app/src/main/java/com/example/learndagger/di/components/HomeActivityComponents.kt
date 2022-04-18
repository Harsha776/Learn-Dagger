package com.example.learndagger.di.components

import com.example.learndagger.Ui.home.HomeActivity
import com.example.learndagger.di.modules.HomeActicityModule
import com.example.learndagger.di.scope.ActivityScope
import dagger.Component
import javax.inject.Singleton

@ActivityScope
@Component(dependencies = [ApplicationComponents::class], modules = [HomeActicityModule::class])
 interface HomeActivityComponents{
     fun injecct(homeActivity: HomeActivity)
 }
