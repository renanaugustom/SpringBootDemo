package com.springbootdemo.Dao;

import com.springbootdemo.Entity.Product;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDao {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<Integer, Product>() {
            {
                put(1, new Product(1, "Apple", new BigDecimal(1.3)));
                put(2, new Product(2, "Banana", new BigDecimal(2.5)));
                put(3, new Product(3, "Orange", new BigDecimal(3.0)));
            }
        };
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }
}
