package com.psf.psfrest.utils;

import com.jayway.jsonpath.JsonPath;
import com.psf.psfrest.model.User;
import org.springframework.stereotype.Service;


@Service
public class Utils {

    public User getUserCredentials(String jsonString) {
       String token = JsonPath.read(jsonString,"$.details.tokenValue");
       String name = JsonPath.read(jsonString, "$.userAuthentication.details.given_name");
       String lastName = JsonPath.read(jsonString, "$.userAuthentication.details.family_name");
       String email = JsonPath.read(jsonString, "$.userAuthentication.details.email");
       System.out.println(name +" "+lastName+" "+email+" \n"+token);

       return new User(token, name, lastName, email);
    }


    public void fromJson() {

    }


    public void serialization() {

    }


    public void deserialization() {

    }
}
