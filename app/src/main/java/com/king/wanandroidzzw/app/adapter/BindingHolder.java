package com.king.wanandroidzzw.app.adapter;

import android.databinding.ViewDataBinding;
import android.view.View;

import com.king.base.adapter.holder.ViewHolder;
import com.king.wanandroidzzw.R;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class BindingHolder extends ViewHolder {
    public BindingHolder(View convertView) {
        super(convertView);
    }


    public ViewDataBinding getBinding() {
        return (ViewDataBinding) itemView.getTag(R.id.dataBinding);
    }
}
