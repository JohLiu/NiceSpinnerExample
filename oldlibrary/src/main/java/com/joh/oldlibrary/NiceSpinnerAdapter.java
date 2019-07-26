package com.joh.oldlibrary;

import android.content.Context;

import java.util.List;

/**
 * Spinner的适配器<T>
 *
 * @author : Joh Liu
 * @date : 2019/7/26 13:10
 */
public class NiceSpinnerAdapter<T> extends NiceSpinnerBaseAdapter {

    private final List<T> items;

    NiceSpinnerAdapter(Context context, List<T> items, int textColor) {
        super(context, textColor);
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public T getItem(int position) {
        return items.get(position);
    }

    @Override
    public T getItemInDataset(int position) {
        return items.get(position);
    }
}