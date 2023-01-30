package com.example.sampleaffablebean.service;

import com.example.sampleaffablebean.dao.ProductDao;
import com.example.sampleaffablebean.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> listProductByCategory(int id){
        return productDao.findProductByCategoryId(id);
    }
}
