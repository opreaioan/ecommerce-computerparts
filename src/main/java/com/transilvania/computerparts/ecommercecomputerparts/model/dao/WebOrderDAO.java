package com.transilvania.computerparts.ecommercecomputerparts.model.dao;

import com.transilvania.computerparts.ecommercecomputerparts.model.LocalUser;
import com.transilvania.computerparts.ecommercecomputerparts.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {

    List<WebOrder> findByUser(LocalUser user);
}
