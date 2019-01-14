package com.king.wanandroidzzw.app.account;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.king.wanandroidzzw.app.base.DataRepository;
import com.king.wanandroidzzw.app.base.DataViewModel;
import com.king.wanandroidzzw.bean.Resource;
import com.king.wanandroidzzw.bean.User;

import javax.inject.Inject;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class LoginViewModel extends DataViewModel {

    @Inject
    public LoginViewModel(@NonNull Application application, DataRepository repository) {
        super(application, repository);
    }

    public LiveData<Resource<User>> login(String username,String password){
        return getRepository().login(username,password);
    }

    public LiveData<Resource<User>> register(String username,String password){
        return getRepository().register(username,password);
    }
}
