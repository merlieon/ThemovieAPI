package com.example.ThemovieAPI;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    HttpConnection httpConnection = new HttpConnection();

    // Getting all movies and saving it to a list
    public List<Movie> getAllMovies() throws IOException, JSONException {
        String url = "https://api.themoviedb.org/3/discover/movie?api_key=3c8897057aeaebba43640644ee491c59&language=en-US&sort_by=release_date.asc&include_adult=false&include_video=false&page=3";
        JSONObject respose = new JSONObject(httpConnection.GetConnection(url).toString());

        List<Movie> movieList = new ArrayList<>();
        JSONArray arr = respose.getJSONArray("results");
        for (int i = 0; i < arr.length(); i++) {
            String original_title = arr.getJSONObject(i).getString("original_title");
            String original_language = arr.getJSONObject(i).getString("original_language");
            String overview = arr.getJSONObject(i).getString("overview");
            int id = arr.getJSONObject(i).getInt("id");
            String release_date = arr.getJSONObject(i).getString("release_date");

            movieList.add(new Movie(id,original_title,overview,original_language,release_date));
        }
        return movieList;
    }
}
