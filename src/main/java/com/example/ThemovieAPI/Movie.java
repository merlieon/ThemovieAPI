package com.example.ThemovieAPI;

public class Movie {

    // setting variables for bean class
    long id;
    String original_language;
    String original_title;
    String overview;
    String release_date;

    Movie(int id, String original_title, String overview, String original_language, String release_date){
        this.original_title = original_title;
        this.original_language = original_language;
        this.overview = overview;
        this.id = id;
        this.release_date = release_date;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}
