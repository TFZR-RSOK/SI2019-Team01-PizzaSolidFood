package com.psf.psfrest.utils;

import com.jayway.jsonpath.JsonPath;
import com.psf.psfrest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Utils {

    private final User user;

    @Autowired
    public Utils(User user) {
        this.user = user;
    }

    public User getUserCredentials(String jsonString) {
       user.setToken(JsonPath.read(jsonString,"$.details.tokenValue"));
       user.setName(JsonPath.read(jsonString, "$.userAuthentication.details.given_name"));
       user.setLastName(JsonPath.read(jsonString, "$.userAuthentication.details.family_name"));
       user.setEmail(JsonPath.read(jsonString, "$.userAuthentication.details.email"));
       //System.out.println(name +" "+lastName+" "+email+" \n"+token);

       return user;
    }
}
