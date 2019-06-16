package com.psf.psfrest.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.psf.psfrest.entity.User;
import com.psf.psfrest.service.IUserService;
import com.psf.psfrest.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.security.Principal;

@RestController
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
        String jsonString = mapper.writeValueAsString(p.toString());
        googleUser = utils.getUserCredentials(jsonString);

        psfUser = userService.findUserByEmail(googleUser.getEmail());
        if (psfUser == null) {
            userService.saveNewUser(googleUser);
            return googleUser;
        }
        else {
            return psfUser;
        }
    }

    @PostMapping("/auth/logout/")
    public RedirectView logoutUser() {

        return new RedirectView("https://mail.google.com/mail/logout?hl=en");
    }

}
