package com.springbootdemo.Controllers;

import com.springbootdemo.Entity.Product;
import com.springbootdemo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method =  RequestMethod.GET)
    public Collection<Product> getAll(){
        return productService.getAll();
    }
}
