package com.jess.myrealtrip.di.module

import androidx.lifecycle.ViewModel
import com.jess.myrealtrip.di.qualifier.ViewModelKey
import com.jess.myrealtrip.presenter.main.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

}