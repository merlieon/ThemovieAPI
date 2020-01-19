package com.example.ThemovieAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HttpConnection {

    // method for URL GET Request
    public String GetConnection(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent","Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("Sending GET Request");
        System.out.println("Response Code: " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream())
        );
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null){
            response.append(inputLine).toString();
        }

        in.close();
        return response.append(inputLine).toString();
    }

}
