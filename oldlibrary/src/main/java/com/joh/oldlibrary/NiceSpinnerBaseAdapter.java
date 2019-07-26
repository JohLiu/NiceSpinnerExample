package com.joh.oldlibrary;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Spinner的基础适配器
 *
 * @author : Joh Liu
 * @date : 2019/7/26 13:10
 */
public abstract class NiceSpinnerBaseAdapter<T> extends BaseAdapter {

    private int textColor;

    public NiceSpinnerBaseAdapter(Context context, int textColor) {
        this.textColor = textColor;
    }

    @Override
    public View getView(int position, @Nullable View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        TextView textView;

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.spinner_list_item, null);
            textView = (TextView) convertView.findViewById(R.id.text_view_spinner);
            convertView.setTag(new ViewHolder(textView));
        } else {
            textView = ((ViewHolder) convertView.getTag()).textView;
        }

        textView.setText(getItemInDataset(position).toString());
        textView.setTextColor(textColor);
        return convertView;
    }

    public abstract T getItemInDataset(int position);

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public abstract T getItem(int position);

    @Override
    public abstract int getCount();

    static class ViewHolder {
        TextView textView;

        ViewHolder(TextView textView) {
            this.textView = textView;
        }
    }
}
