package com.example.space.DependencyInjection

import com.example.space.networkService.LaunchService
import com.example.space.repository.Repository
import com.example.space.viewModel.LaunchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val LaunchModule = module{
    single { Repository()}
    single{ LaunchService()}
    viewModel { LaunchViewModel() }
}