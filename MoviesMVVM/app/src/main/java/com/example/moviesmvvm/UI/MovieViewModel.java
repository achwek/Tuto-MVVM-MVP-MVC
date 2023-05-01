package com.example.moviesmvvm.UI;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.moviesmvvm.Model.MoviesModel;

public class MovieViewModel extends ViewModel {
   // LiveData<String> movieTitleLiveData;
    MutableLiveData<String>  movieMutableLiveData= new MutableLiveData<>();
    public  void getMovieTitle(){
        String movieTitle = getMoviesFromDB().getTitle();
        movieMutableLiveData.setValue(movieTitle);
    }

    public MoviesModel getMoviesFromDB() {
        return new MoviesModel("Cendrillon", "1988", "Cendrillon est un conte ancien et le nom du personnage central.", 1);
    }


}
