package com.psf.psfrest.controllers;


import com.psf.psfrest.utils.Utils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.Principal;

@RestController
public class Auth {

    @RequestMapping("/hello")
    public String authLogout() {
        return "hello";
    }


    @GetMapping("/auth/user")
    public Principal userToken(Principal p) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(p);

        Utils utils = new Utils();
        utils.getUserCredentials(jsonString);


        return p;
    }

}
