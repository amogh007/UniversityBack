package com.example.demo;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.openjson.JSONArray;
import com.github.openjson.JSONObject;
import com.google.gson.Gson;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.Map;

@RestController
public class ControllerUni {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/hello")
    public ArrayList<University> helloWorld() {
        String url = "http://universities.hipolabs.com/search?country=India";  // example url which return json data
        ArrayList<University> bomb=doSomething(url);
        return bomb;

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/hello/{country}")
   public ArrayList<University> getCountry(@PathVariable String country){
        String url = "http://universities.hipolabs.com/search?country="+country.trim();
        ArrayList<University> bap=doSomething(url);
        return bap;
    }






   public ArrayList<University> doSomething(String ul){
       RestTemplate restTemplate=new RestTemplate();
       String result=restTemplate.getForObject(ul,String.class);
       JSONArray jsonArr=new JSONArray(result);
       ArrayList<University> countries=new ArrayList<University>();
       for (int i = 0; i < jsonArr.length(); i++)
       {
           JSONObject jsonObj = jsonArr.getJSONObject(i);
           String country= (String) jsonObj.get("country");
           String name=(String) jsonObj.get("name");
           String domains= String.valueOf(jsonObj.get("domains"));
           String alphaTwoCode=(String) jsonObj.get("alpha_two_code");
           String stateProvince= String.valueOf(jsonObj.get("state-province"));
           String webPages= String.valueOf(jsonObj.get("web_pages"));

           countries.add(new University(country,name,domains,alphaTwoCode,stateProvince,webPages));

       }return countries;

   }


}

