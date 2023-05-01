package com.example.moviesmvvm.Model;

public class MoviesModel {
    String title;
    String data;
    String description;
    int id;

    public MoviesModel(String title, String data, String description, int id) {
        this.title = title;
        this.data = data;
        this.description = description;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
