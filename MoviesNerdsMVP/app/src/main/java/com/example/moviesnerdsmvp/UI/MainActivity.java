package com.example.moviesnerdsmvp.UI;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviesnerdsmvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieView {

    MoviesPresenter presenter;
    @BindView(R.id.textView)
    TextView tvTitle;
    @BindView(R.id.btnMovies)
    Button btnMovie;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnMovie.setOnClickListener(this);

        presenter = new MoviesPresenter(this);

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnMovies) {
            presenter.getMovieTitle();
        }
    }

    @Override
    public void onGetMovieTitle(String title) {
        tvTitle.setText(title);
    }
}