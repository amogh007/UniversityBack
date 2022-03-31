package com.example.demo;

import com.github.openjson.JSONArray;
import com.github.openjson.JSONObject;
import org.springframework.web.client.RestTemplate;
import com.github.openjson.JSONArray;
import com.github.openjson.JSONObject;

import java.util.ArrayList;

public class UniversityServices {
    ArrayList<University> countries=new ArrayList<University>();
    UniversityServices(){

    }
    public ArrayList<University> findAll(){
        return this.countries;
    }

}
