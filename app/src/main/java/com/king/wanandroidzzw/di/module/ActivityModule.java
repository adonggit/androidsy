package com.king.wanandroidzzw.di.module;

import com.king.wanandroidzzw.app.about.AboutActivity;
import com.king.wanandroidzzw.app.account.LoginActivity;
import com.king.wanandroidzzw.app.account.RegisterActivity;
import com.king.wanandroidzzw.app.collect.CollectActivity;
import com.king.wanandroidzzw.app.home.HomeActivity;
import com.king.wanandroidzzw.app.navi.NaviActivity;
import com.king.wanandroidzzw.app.search.SearchActivity;
import com.king.wanandroidzzw.app.splash.SplashActivity;
import com.king.wanandroidzzw.app.tree.TreeActivity;
import com.king.wanandroidzzw.app.tree.TreeChildrenActivity;
import com.king.wanandroidzzw.app.web.WebActivity;
import com.king.wanandroidzzw.di.component.BaseActivitySubComponent;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Module(subcomponents = BaseActivitySubComponent.class)
public abstract class ActivityModule {

//
//    @Binds
//    @IntoMap
//    @ActivityKey(HomeActivity.class)
//    public abstract AndroidInjector<? extends Activity> bindHomeActivityInjectorFactory(BaseActivitySubComponent.Builder builder);


    @ContributesAndroidInjector
    abstract SplashActivity contributesSplashActivity();

    @ContributesAndroidInjector
    abstract HomeActivity contributesHomeActivity();

    @ContributesAndroidInjector
    abstract WebActivity contributesWebActivity();

    @ContributesAndroidInjector
    abstract LoginActivity contributesLoginActivity();

    @ContributesAndroidInjector
    abstract RegisterActivity contributesRegisterActivity();

    @ContributesAndroidInjector
    abstract CollectActivity contributesCollectActivity();

    @ContributesAndroidInjector
    abstract TreeActivity contributesTreeActivity();

    @ContributesAndroidInjector
    abstract TreeChildrenActivity contributesTreeChildrenActivity();

    @ContributesAndroidInjector
    abstract SearchActivity contributesSearchActivity();

    @ContributesAndroidInjector
    abstract NaviActivity contributesNaviActivity();

    @ContributesAndroidInjector
    abstract AboutActivity contributesAboutActivity();
}
