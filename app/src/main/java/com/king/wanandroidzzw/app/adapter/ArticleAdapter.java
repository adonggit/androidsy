package com.king.wanandroidzzw.app.adapter;

import android.content.Context;
import android.databinding.ViewDataBinding;

import com.king.wanandroidzzw.BR;
import com.king.wanandroidzzw.R;
import com.king.wanandroidzzw.bean.ArticleBean;
import com.king.wanandroidzzw.util.TimeUtils;

import java.util.List;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class ArticleAdapter extends EmptyAdapter<ArticleBean> {
    public ArticleAdapter(Context context, List<ArticleBean> listData) {
        super(context, listData);
    }

    @Override
    public void bindViewData(BindingHolder holder, ArticleBean data, int position) {
        ViewDataBinding binding = holder.getBinding();
        binding.setVariable(BR.data,data);
        holder.setText(R.id.tvTime, TimeUtils.getUpdatedRelativeTime(getContext(),data.getPublishTime()));
        holder.setSelecteded(R.id.ivCollect,data.isCollect());
        holder.setOnClickListener(R.id.ivCollect, v -> onItemClick(v,position));

        binding.executePendingBindings();
    }

    @Override
    public int getItemViewId() {
        return R.layout.rv_article_item;
    }


}
