package com.king.wanandroidzzw.di.module;

import android.arch.lifecycle.ViewModel;

import com.king.wanandroidzzw.app.account.LoginViewModel;
import com.king.wanandroidzzw.app.base.DataViewModel;
import com.king.wanandroidzzw.app.collect.CollectViewModel;
import com.king.wanandroidzzw.app.home.HomeViewModel;
import com.king.wanandroidzzw.app.navi.NaviViewModel;
import com.king.wanandroidzzw.app.search.SearchViewModel;
import com.king.wanandroidzzw.app.tree.TreeViewModel;
import com.king.wanandroidzzw.di.scope.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DataViewModel.class)
    abstract ViewModel bindDataViewModel(DataViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindLoginViewModel(LoginViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(CollectViewModel.class)
    abstract ViewModel bindCollectViewModel(CollectViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(TreeViewModel.class)
    abstract ViewModel bindTreeViewModel(TreeViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel.class)
    abstract ViewModel bindSearchViewModel(SearchViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(NaviViewModel.class)
    abstract ViewModel bindNaviViewModel(NaviViewModel viewModel);


}
