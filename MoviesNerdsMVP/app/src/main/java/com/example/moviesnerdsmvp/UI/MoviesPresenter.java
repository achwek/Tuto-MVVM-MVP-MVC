package com.example.moviesnerdsmvp.UI;

import com.example.moviesnerdsmvp.Model.MoviesModel;

public class MoviesPresenter {
 MovieView view;
    public MoviesPresenter (MovieView view) {
        this.view=view;
    }
    public MoviesModel getMoviesFromDB() {
        return new MoviesModel("Cendrillon", "1988", "Cendrillon est un conte ancien et le nom du personnage central.", 1);
    }

    public void getMovieTitle(){
        view.onGetMovieTitle(getMoviesFromDB().getTitle());
    }

}
