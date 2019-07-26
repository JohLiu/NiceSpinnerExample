package com.joh.oldlibrary;

import android.content.Context;
import android.widget.ListAdapter;

/**
 * Spinner的适配器<String>
 *
 * @author : Joh Liu
 * @date : 2019/7/26 13:10
 */
public class NiceSpinnerAdapterWrapper extends NiceSpinnerBaseAdapter {

    private final ListAdapter baseAdapter;

    NiceSpinnerAdapterWrapper(Context context, ListAdapter toWrap, int textColor) {
        super(context, textColor);
        baseAdapter = toWrap;
    }

    @Override
    public int getCount() {
        return baseAdapter.getCount();
    }

    @Override
    public Object getItem(int position) {
        return baseAdapter.getItem(position);
    }

    @Override
    public Object getItemInDataset(int position) {
        return baseAdapter.getItem(position);
    }
}