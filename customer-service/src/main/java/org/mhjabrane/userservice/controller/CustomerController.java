package org.mhjabrane.userservice.controller;

import org.mhjabrane.userservice.dto.CustomerDTO;
import org.mhjabrane.userservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/addUser")
    public ResponseEntity<CustomerDTO> addUser(@RequestBody CustomerDTO customerDTO){
        CustomerDTO savedUser =  customerService.addUser(customerDTO);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/fetchUserById/{userId}")
    public ResponseEntity<CustomerDTO> fetchUserDetailsById(@PathVariable Integer userId){
        return customerService.fetchUserDetailsById(userId);
    }



}
