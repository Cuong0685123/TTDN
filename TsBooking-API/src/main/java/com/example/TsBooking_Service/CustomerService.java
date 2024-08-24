package com.example.TsBooking_Service;

import com.example.TsBooking_Dao.CustomerDAO;
import com.example.TsBooking_Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void registerCustomer(Customer customer) {
        customerDAO.signup(customer);  // Đổi tên phương thức gọi từ saveCustomer thành signup
    }
}
