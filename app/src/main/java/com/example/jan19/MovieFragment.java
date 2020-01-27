package com.example.jan19;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieFragment extends Fragment {

    public MovieFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_movie, container, false);

        MoviesAdapter moviesAdapter = new MoviesAdapter(getContext(), new ArrayList<Movie>());

        ListView articlesList = rootView.findViewById(R.id.listView);
        articlesList.setAdapter(moviesAdapter);
        FetchMoviesTask task = new FetchMoviesTask(moviesAdapter);
        task.execute();



        return rootView;
    }

}
