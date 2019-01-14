package com.king.wanandroidzzw.api;

import com.king.wanandroidzzw.bean.BaseResult;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public abstract class ApiCallback<T extends BaseResult> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        T data = response.body();
        onResponse(call,data);
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        Timber.w(t);
        onError(call,t);
    }


    public abstract void onResponse(Call<T> call,T result);

    public abstract void onError(Call<T> call,Throwable t);


}
