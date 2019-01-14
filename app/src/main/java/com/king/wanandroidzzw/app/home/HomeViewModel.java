package com.king.wanandroidzzw.app.home;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.king.wanandroidzzw.app.base.DataRepository;
import com.king.wanandroidzzw.app.base.DataViewModel;
import com.king.wanandroidzzw.bean.ArticleBean;
import com.king.wanandroidzzw.bean.BannerBean;
import com.king.wanandroidzzw.bean.DataBean;
import com.king.wanandroidzzw.bean.Resource;
import com.king.wanandroidzzw.bean.VersionBean;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class HomeViewModel extends DataViewModel {

    @Inject
    public HomeViewModel(@NonNull Application application,DataRepository repository) {
        super( application,repository);
    }

    public LiveData<Resource<DataBean<List<ArticleBean>>>> getArticlesList(int curPage){
        return getRepository().getArticlesList(curPage);
    }

    public LiveData<Resource<List<BannerBean>>> getBanner(){
        return getRepository().getBanner();
    }

    public LiveData<Resource<VersionBean>> checkVersion(){
        return getRepository().checkVersion();
    }
}
