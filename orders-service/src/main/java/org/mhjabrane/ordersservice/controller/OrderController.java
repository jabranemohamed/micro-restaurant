package org.mhjabrane.ordersservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.mhjabrane.ordersservice.dto.OrderDTO;
import org.mhjabrane.ordersservice.dto.OrderDTOFromFE;
import org.mhjabrane.ordersservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@CrossOrigin
@RestController
@Slf4j
@Transactional
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails) {
        OrderDTO orderSavedInDB = orderService.saveOrderInDb(orderDetails);
        return new ResponseEntity<>(orderSavedInDB, HttpStatus.CREATED);
    }


}
