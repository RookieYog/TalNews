package com.talnews.adapter;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.LoopPagerAdapter;

import java.util.ArrayList;

/**
 * Created by ThinkPad on 2016/11/21.
 */

public class RollPagerViewAdapter extends LoopPagerAdapter {
    public ArrayList<Drawable> mImageLists;

    public RollPagerViewAdapter(RollPagerView viewPager,ArrayList<Drawable> imageLists) {
        super(viewPager);
        this.mImageLists=imageLists;
    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setImageDrawable(mImageLists.get(position));
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getRealCount() {
        return mImageLists.size();
    }

}
