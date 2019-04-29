package com.psf.psfrest.utils;

import com.jayway.jsonpath.JsonPath;

public class Utils {

    public void getUserCredentials(String jsonString) {
       String token = JsonPath.read(jsonString,"$.details.tokenValue");
        System.out.println(token);
    }


    public void fromJson() {

    }


    public void serialization() {

    }


    public void deserialization() {

    }
}
