package com.springbootdemo.Dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import com.springbootdemo.Entity.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    private static ArrayList<Product> products;

    static {
        products = new ArrayList<Product>()
        {{
            add(new Product(1, "Orange", new BigDecimal(1.3)));
            add(new Product(2, "Apple", new BigDecimal(2.5)));
            add(new Product(3, "Banana", new BigDecimal(3.0)));
        }};
    }

    public Collection<Product> getAllProducts() {
        Collections.sort(products, (Product s1, Product s2) ->{
            return s1.getName().compareToIgnoreCase(s2.getName());
        });

        return products;
    }

    public Optional<Product> getByName(String name) {
        return products.stream().filter(x -> 
            x.getName().compareToIgnoreCase(name) == 0).findFirst();
    }
}
