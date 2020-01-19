package com.example.ThemovieAPI;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
public class MovieController {

    //Connecting MovieService class and this one
    @Autowired
    private MovieService movieService;

    //Getting all Movies and connecting with HTML
    @GetMapping("/movies")
    public String formSubmit (Model model) throws IOException, JSONException {
        model.addAttribute("movies", movieService.getAllMovies());
        return "movies";
    }


}


