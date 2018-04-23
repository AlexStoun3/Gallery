package com.example.danil.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

        private Context context;

        public Integer[] images = {  //объявление элементов галлереи
                R.drawable.vk_com_oboihd_18702 , R.drawable.vk_com_oboihd_19881,
                R.drawable.vk_com_oboihd_19885, R.drawable.vk_com_oboihd_22739,
                R.drawable.vk_com_oboihd_24304
        };
        public ImageAdapter(Context c){
            context = c;
        }

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return images[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView (context);
            imageView.setImageResource(images[position]);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setLayoutParams(new GridView.LayoutParams(240,240));
            return imageView;
        }
    }
