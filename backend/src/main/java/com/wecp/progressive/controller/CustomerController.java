package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class CustomerController {
    
@GetMapping("/customer")
public ResponseEntity<List<Customers>> getAllCustomers() {
        return null;
    }
    @GetMapping("/customer/{customerID}")
    public ResponseEntity<Customers> getCustomerById(int customerId) {
        return null;
    }
@PostMapping("/customers")
    public ResponseEntity<Integer> addCustomer(Customers customers) {
        return null;
    }
@PutMapping("customers/{customerID}")

    public ResponseEntity<Void> updateCustomer(int customerId, Customers customers) {
        return null;
    }
    @DeleteMapping("customers/{customerID}")
    public ResponseEntity<Void> deleteCustomer(int customerId) {
        return null;
    }

    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
        return null;
    }
}
