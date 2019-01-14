package com.king.wanandroidzzw.di.component;

import android.app.Application;
import android.content.Context;

import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.king.wanandroidzzw.App;
import com.king.wanandroidzzw.api.ApiService;
import com.king.wanandroidzzw.di.module.ActivityModule;
import com.king.wanandroidzzw.di.module.AppModule;
import com.king.wanandroidzzw.di.module.HttpModule;
import com.king.wanandroidzzw.di.module.ViewModelFactoryModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class, ActivityModule.class,ViewModelFactoryModule.class, AndroidInjectionModule.class,AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<App> {


    void inject(App app);

    Application getApplication();

    Context getContext();

    ApiService getApiService();

    PersistentCookieJar getCookieJar();

}
