package com.king.wanandroidzzw.di.module;

import android.arch.lifecycle.ViewModelProvider;

import com.king.wanandroidzzw.app.base.ViewModelFactory;

import dagger.Binds;
import dagger.Module;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Module(includes = ViewModelModule.class)
public abstract class ViewModelFactoryModule {

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory viewModelFactory);
}
