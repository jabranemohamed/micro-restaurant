package org.mhjabrane.userservice.service;

import org.mhjabrane.userservice.dto.CustomerDTO;
import org.mhjabrane.userservice.entity.Customer;
import org.mhjabrane.userservice.mapper.CustomerMapper;
import org.mhjabrane.userservice.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired

    CustomerRepo customerRepo;


    public CustomerDTO addUser(CustomerDTO customerDTO) {
        Customer savedCustomer = customerRepo.save(CustomerMapper.INSTANCE.mapUserDTOToUser(customerDTO));
        return CustomerMapper.INSTANCE.mapUserToUserDTO(savedCustomer);

    }

    public ResponseEntity<CustomerDTO> fetchUserDetailsById(Integer userId) {
        Optional<Customer> fetchedCustomer =  customerRepo.findById(userId);
        if(fetchedCustomer.isPresent())
            return new ResponseEntity<>(CustomerMapper.INSTANCE.mapUserToUserDTO(fetchedCustomer.get()), HttpStatus.OK);
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }
}
