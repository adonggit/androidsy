package com.king.wanandroidzzw.app.base;

import com.king.wanandroidzzw.api.ApiService;
import com.king.wanandroidzzw.bean.BaseResult;


/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class BaseRepository {

    private ApiService apiService;

    public BaseRepository(ApiService apiService){
        this.apiService = apiService;
    }

    public ApiService getApiService() {
        return apiService;
    }

    public boolean isSuccess(BaseResult result){
        return result!=null && result.isSuccess();
    }


}
