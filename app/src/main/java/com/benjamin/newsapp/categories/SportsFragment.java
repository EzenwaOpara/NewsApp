package com.benjamin.newsapp.categories;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.benjamin.newsapp.R;
import com.benjamin.newsapp.data.NewsAdapter;
import com.benjamin.newsapp.data.NewsData;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sports, container, false);
        ListView listView = view.findViewById(R.id.list_item_sports);
        ArrayList<NewsData> newsData = new ArrayList<>();

        newsData.add(new NewsData("13 year old boy solves legendary math problem", "3rd May, 2020",
                R.drawable.boy));
        newsData.add(new NewsData("Trump encourages healthy living admist novel covid-19 pademic",
                "4th May, 2020", R.drawable.trump));
        newsData.add(new NewsData("ACCESS denies closing branches", "4th May, 2020",
                R.drawable.access));
        newsData.add(new NewsData("Trump encourages healthy living admist novel covid-19 pademic",
                "4th May, 2020", R.drawable.trump));
        newsData.add(new NewsData("ACCESS denies closing branches", "4th May, 2020",
                R.drawable.access));
        newsData.add(new NewsData("COVID-19: Bright light at the end of the tunnel",
                "4th May, 2020", R.drawable.covid));
        newsData.add(new NewsData("Chikwe declears intention for 2023", "3rd May, 2020",
                R.drawable.chikwe));
        newsData.add(new NewsData("Local government donates relief materials", "3rd May, 2020",
                R.drawable.rice));
        newsData.add(new NewsData("COVID-19: Bright light at the end of the tunnel",
                "4th May, 2020", R.drawable.covid));
        newsData.add(new NewsData("Chikwe declears intention for 2023", "3rd May, 2020",
                R.drawable.chikwe));
        newsData.add(new NewsData("Local government donates relief materials", "3rd May, 2020",
                R.drawable.rice));
        newsData.add(new NewsData("13 year old boy solves legendary math problem", "3rd May, 2020",
                R.drawable.boy));


        NewsAdapter adapter = new NewsAdapter(getContext(), R.layout.list_news, newsData);
        listView.setAdapter(adapter);
        return view;
    }

}
