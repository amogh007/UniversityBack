package com.example.demo;

import com.github.openjson.JSONArray;
import com.github.openjson.JSONObject;

import java.util.ArrayList;

public class University {
    String country;
    String name;
    ArrayList<String> domains;
    String alphaTwoCode;
    String stateProvince;
    ArrayList<String> webPpages;
    public ArrayList<String> convert(String so){


       JSONArray BD=new JSONArray(so);
       ArrayList<String> rs=new ArrayList<String>();
       for(int i=0;i<BD.length();i++){
           rs.add(String.valueOf(BD.get(i)));
       }
        System.out.println(rs);
        return rs;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDomains() {
        return domains;
    }

    public void setDomains(String domains) {

        this.domains = this.convert(domains);
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    public Object getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Object getWebPpages() {
        return webPpages;
    }

    public void setWebPpages(String webPpages) {
        this.webPpages = this.convert(webPpages);
    }

    public University(String country, String name, String domains, String alphaTwoCode, String stateProvince, String webPpages) {
        this.country = country;
        this.name = name;
        this.domains = this.convert(domains);
        this.alphaTwoCode = alphaTwoCode;
        this.stateProvince = stateProvince;
        this.webPpages = this.convert(webPpages);
    }
}
