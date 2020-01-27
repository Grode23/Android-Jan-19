package com.example.jan19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MoviesAdapter extends ArrayAdapter<Movie> {

    private ArrayList<Movie> movies;
    private Context context;

    public MoviesAdapter(Context context, ArrayList<Movie> objects) {
        super(context, 0, objects);

        this.movies = objects;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        ViewHolder viewHolder;

        Movie movie = movies.get(position);


        if(rowView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            rowView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder(rowView);
            rowView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder)rowView.getTag();
        }

        viewHolder.title.setText(movie.getTitle());
        viewHolder.description.setText(movie.getDescription());
        viewHolder.prototypeTitle.setText(movie.getPrototypeTitle());
        viewHolder.date.setText("Πρώτη προβολή: " + movie.getDate());
        viewHolder.score.setText(String.valueOf(movie.getScore()));
        Picasso.get().load(movie.getPosterUrl()).into(viewHolder.poster);



        return  rowView;

    }
    private class ViewHolder {
        final TextView title;
        final TextView prototypeTitle;
        final TextView description;
        final TextView date;
        final TextView score;
        final ImageView poster;

        ViewHolder(View view){
            title= view.findViewById(R.id.title);
            prototypeTitle = view.findViewById(R.id.prototypeTitle);
            description = view.findViewById(R.id.description);
            date = view.findViewById(R.id.date);
            score = view.findViewById(R.id.score);
            poster = view.findViewById(R.id.imageView);
        }
    }


}
