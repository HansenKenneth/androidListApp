package com.example.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    private String [] data;
    private int [] images;
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, String[] data, int[] images) {
        this.data = data;
        this.images = images;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = layoutInflater.inflate(R.layout.myrow, null);
        }
        TextView textView = view.findViewById(R.id.myListView);
        textView.setText(data[i]);
        ImageView imageView = view.findViewById(R.id.myImageView);
        imageView.setImageResource(images[i]);
        return view;
    }
}
