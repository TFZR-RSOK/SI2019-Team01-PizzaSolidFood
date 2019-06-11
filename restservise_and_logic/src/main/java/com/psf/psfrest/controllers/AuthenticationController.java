package com.psf.psfrest.controllers;


import com.psf.psfrest.entity.User;
import com.psf.psfrest.repository.UserRepository;
import com.psf.psfrest.service.IUserService;
import com.psf.psfrest.utils.Utils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.security.Principal;

@Controller
@CrossOrigin
public class AuthenticationController {

    @Autowired
    private Utils utils;
    @Autowired
    private IUserService userService;
    @Autowired
    private User googleUser;
    @Autowired
    private User psfUser;

    @GetMapping("/auth/login")
    public @ResponseBody User loginUser(Principal p) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(p);
        googleUser = utils.getUserCredentials(jsonString);
        psfUser = userService.findUserByEmail(googleUser.getEmail());
        if (psfUser == null) {
            userService.saveNewUser(googleUser);
            return googleUser;
        }
        else {
            psfUser.setToken(googleUser.getToken());
            return psfUser;
        }
    }

    @PostMapping("/auth/logout/{token}")
    public RedirectView logoutUser(@PathVariable String token) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("https://accounts.google.com/o/oauth2/revoke?token={token}",String.class, token);

        return new RedirectView("https://mail.google.com/mail/logout?hl=en");
    }

}
