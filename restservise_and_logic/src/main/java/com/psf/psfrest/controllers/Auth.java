package com.psf.psfrest.controllers;


import com.psf.psfrest.utils.Utils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.security.Principal;

@RestController
public class Auth {

    @Autowired
    private Utils utils;

    @GetMapping("/auth/login")
    public Principal loginUser(Principal p) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(p);

        utils.getUserCredentials(jsonString);
        return  p;
    }

    @RequestMapping("/auth/logout")
    public void logoutUser(String token) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("https://accounts.google.com/o/oauth2/revoke?token={token}",String.class, token);
    }

}
