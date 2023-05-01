package com.example.moviesnerds.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.moviesnerds.Model.MoviesModel;
import com.example.moviesnerds.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        private TextView tvTitle;
        private Button btnGetMovies;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle= findViewById(R.id.textView);
        btnGetMovies = findViewById(R.id.btnMovies);
        btnGetMovies.setOnClickListener(this);

    }
    public MoviesModel getMoviesFromDB(){
        return new MoviesModel("Cendrillon","1988","Cendrillon est un conte ancien et le nom du personnage central.",1);
    }
    public void getMovie() {
        tvTitle.setText(getMoviesFromDB().getTitle());}

        @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnMovies){
            getMovie();
        }
    }


}