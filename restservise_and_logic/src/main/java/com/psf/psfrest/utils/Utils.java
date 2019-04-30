package com.psf.psfrest.utils;

import com.jayway.jsonpath.JsonPath;
import org.springframework.stereotype.Service;

@Service
public class Utils {

    public String getUserCredentials(String jsonString) {
       String token = JsonPath.read(jsonString,"$.details.tokenValue");
       String name = JsonPath.read(jsonString, "$.userAuthentication.details.given_name");
       String lastName = JsonPath.read(jsonString, "$.userAuthentication.details.family_name");
       String email = JsonPath.read(jsonString, "$.userAuthentication.details.email");
       System.out.println(name +" "+lastName+" "+email+" \n"+token);

        return token;
    }


    public void fromJson() {

    }


    public void serialization() {

    }


    public void deserialization() {

    }
}
