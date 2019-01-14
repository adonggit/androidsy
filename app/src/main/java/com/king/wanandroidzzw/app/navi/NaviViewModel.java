package com.king.wanandroidzzw.app.navi;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.king.wanandroidzzw.app.base.DataRepository;
import com.king.wanandroidzzw.app.base.DataViewModel;
import com.king.wanandroidzzw.bean.NaviBean;
import com.king.wanandroidzzw.bean.Resource;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class NaviViewModel extends DataViewModel {

    @Inject
    public NaviViewModel(@NonNull Application application, DataRepository repository) {
        super(application, repository);
    }

    /**
     * 获取导航
     * @return
     */
    public LiveData<Resource<List<NaviBean>>> getNavi(){
        return getRepository().getNavi();
    }
}
