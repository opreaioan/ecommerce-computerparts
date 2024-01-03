package com.transilvania.computerparts.ecommercecomputerparts.service;

import com.transilvania.computerparts.ecommercecomputerparts.model.Product;
import com.transilvania.computerparts.ecommercecomputerparts.model.dao.ProductDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getProducts() {
        return productDAO.findAll();
    }
}
