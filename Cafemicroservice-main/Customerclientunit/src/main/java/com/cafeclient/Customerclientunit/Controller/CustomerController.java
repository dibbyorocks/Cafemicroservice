package com.cafeclient.Customerclientunit.Controller;

import com.cafeclient.Customerclientunit.Model.Customer;
import com.cafeclient.Customerclientunit.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.persistence.criteria.checkout;
import java.util.List;


    @RestController
    @RequestMapping("/Customer")
    public class CustomerController {

        @Autowired
        private CustomerService customerservice;

        @GetMapping("/getAllCustomer")
        public List<Customer> getAllCustomer()
        {
            return CustomerService.getAllCustomer();
        }

    }



