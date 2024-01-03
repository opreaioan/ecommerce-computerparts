package com.transilvania.computerparts.ecommercecomputerparts.service;

import com.transilvania.computerparts.ecommercecomputerparts.model.LocalUser;
import com.transilvania.computerparts.ecommercecomputerparts.model.WebOrder;
import com.transilvania.computerparts.ecommercecomputerparts.model.dao.WebOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    public List<WebOrder> getOrders(LocalUser user) {
        return webOrderDAO.findByUser(user);
    }

}
