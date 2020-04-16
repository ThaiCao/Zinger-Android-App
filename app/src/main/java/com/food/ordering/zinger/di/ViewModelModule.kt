package com.food.ordering.zinger.di

import com.food.ordering.zinger.ui.home.HomeViewModel
import com.food.ordering.zinger.ui.login.LoginViewModel
import com.food.ordering.zinger.ui.otp.OtpViewModel
import com.food.ordering.zinger.ui.profile.ProfileViewModel
import com.food.ordering.zinger.ui.restaurant.RestaurantViewModel
import com.food.ordering.zinger.ui.search.SearchViewModel
import com.food.ordering.zinger.ui.signup.SignUpViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { LoginViewModel(get()) }
    viewModel { OtpViewModel(get()) }
    viewModel { RestaurantViewModel(get()) }
    viewModel { SignUpViewModel(get(), get()) }
    viewModel { ProfileViewModel(get(), get()) }
    viewModel { SearchViewModel(get()) }
}