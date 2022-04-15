package com.cafeclient.Customerclientunit.Service;

import com.cafeclient.Customerclientunit.Model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="Cafe-service")
public interface CustomerService {


    @GetMapping("/getAllCustomer")
   public static List<Customer> getAllCustomer()
    {
       return CustomerService.getAllCustomer();
    }





/*@FeignClient(name = "BANK-SERVICE")
public interface BankRestConsumer {
    @GetMapping("/getLocation")
    public List<Bank> getAllBanks();
    */

}
