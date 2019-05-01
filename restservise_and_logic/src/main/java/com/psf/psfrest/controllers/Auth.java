package com.psf.psfrest.controllers;


import com.psf.psfrest.model.User;
import com.psf.psfrest.utils.Utils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.security.Principal;

@RestController
public class Auth {

    @Autowired
    private Utils utils;

    @GetMapping("/auth/login")
    public @ResponseBody User loginUser(Principal p) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(p);

        return  utils.getUserCredentials(jsonString);
    }

    @RequestMapping("/auth/logout")
    public RedirectView logoutUser(@RequestParam String token) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("https://accounts.google.com/o/oauth2/revoke?token={token}",String.class, token);

        return new RedirectView("https://mail.google.com/mail/logout?hl=en");
    }

}
