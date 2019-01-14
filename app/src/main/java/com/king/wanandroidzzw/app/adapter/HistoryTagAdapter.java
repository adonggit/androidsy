package com.king.wanandroidzzw.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.king.wanandroidzzw.R;
import com.king.wanandroidzzw.app.comm.Constants;
import com.king.wanandroidzzw.bean.SearchHistory;
import com.king.wanandroidzzw.util.RandomUtils;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;

import java.util.List;


/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
public class HistoryTagAdapter extends TagAdapter<SearchHistory> {
    private Context mContext;
    private LayoutInflater mInflater;

    public HistoryTagAdapter(Context context, List<SearchHistory> datas) {
        super(datas);
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(FlowLayout parent, int position, SearchHistory data) {
        TextView tv = (TextView) mInflater.inflate(R.layout.tree_tag_item,parent,false);
        tv.setText(data.getName());
        tv.setTextColor(RandomUtils.INSTANCE.randomColor(Constants.COLOR_RGB_MIN,Constants.COLOR_RGB_MAX));
        return tv;
    }

}
