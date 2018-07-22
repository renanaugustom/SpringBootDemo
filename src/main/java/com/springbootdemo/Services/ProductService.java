package com.springbootdemo.Services;

import com.springbootdemo.Dao.ProductDao;
import com.springbootdemo.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Collection<Product> getAll(){
        return productDao.getAllProducts();
    }
}
