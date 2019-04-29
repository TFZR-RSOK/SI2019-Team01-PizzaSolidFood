package com.psf.psfrest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProducts {

    @RequestMapping("/public/getProducts")
    public String getProducts() {
        return "Not logged in";
    }
}
