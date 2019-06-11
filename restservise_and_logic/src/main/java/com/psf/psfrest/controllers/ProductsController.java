package com.psf.psfrest.controllers;

import com.psf.psfrest.entity.Additions;
import com.psf.psfrest.service.AdditionsService;
import com.psf.psfrest.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @Autowired
    private AdditionsService additionsService;

    @PostMapping("/public/products")
    public List getProducts() {
        return productsService.getAllProducts();
    }

    @PostMapping("/public/additions")
    public List<Additions> getAdditions() {
        return additionsService.getAllAdditions();
    }
}
