package com.example.TsBooking_Controller;

import com.example.TsBooking_Model.Customer;
import com.example.TsBooking_Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public String registerCustomer(@RequestBody Customer customer) {
        customerService.registerCustomer(customer);  // Không cần đổi tên ở đây vì tên phương thức của service vẫn là registerCustomer
        return "Customer registered successfully!";
    }
}
