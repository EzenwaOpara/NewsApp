package com.benjamin.newsapp.data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.benjamin.newsapp.R;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsData> {
    public NewsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<NewsData> newsData) {
        super(context, resource, newsData);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        NewsData currentNews = getItem(position);

        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_news, parent, false);
        }

        TextView titleTV = view.findViewById(R.id.news_title);
        TextView dateTV = view.findViewById(R.id.news_date);
        ImageView imageView = view.findViewById(R.id.news_image);

        titleTV.setText(currentNews.getTitle());
        dateTV.setText(currentNews.getDate());
        imageView.setImageResource(currentNews.getImageResourceId());

        return view;
    }
}
