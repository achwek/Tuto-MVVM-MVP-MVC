package com.example.moviesmvvm.UI;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.moviesmvvm.R;
import com.example.moviesmvvm.databinding.ActivityMainBinding;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);

        movieViewModel.movieMutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {

                binding.textView.setText(s);
            }
        });
        binding.btnMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movieViewModel.getMovieTitle();
            }
        });
    }



    }