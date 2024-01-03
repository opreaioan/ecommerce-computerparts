package com.transilvania.computerparts.ecommercecomputerparts.model.dao;

import com.transilvania.computerparts.ecommercecomputerparts.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
