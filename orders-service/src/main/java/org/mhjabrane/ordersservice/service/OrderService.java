package org.mhjabrane.ordersservice.service;


import org.mhjabrane.ordersservice.dto.OrderDTO;
import org.mhjabrane.ordersservice.dto.OrderDTOFromFE;
import org.mhjabrane.ordersservice.dto.UserDTO;
import org.mhjabrane.ordersservice.entity.Order;
import org.mhjabrane.ordersservice.mapper.OrderMapper;
import org.mhjabrane.ordersservice.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
@Component("orderService")
public class OrderService {

    private  OrderRepo orderRepo;

    private  SequenceGenerator sequenceGenerator;

    private  RestTemplate restTemplate;

    @Autowired
    public OrderService(OrderRepo orderRepo,SequenceGenerator sequenceGenerator,RestTemplate restTemplate){
        this.orderRepo = orderRepo;
        this.sequenceGenerator = sequenceGenerator;
        this.restTemplate = restTemplate;
    }

    public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = null; //fetchUserDetailsFromUserId(orderDetails.getUserId());
        Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), orderDetails.getRestaurant(), userDTO );
        orderRepo.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
    }

    private UserDTO fetchUserDetailsFromUserId(Integer userId) {
       return restTemplate.getForObject("http://CUSTOMER-SERVICE/user/fetchUserById/" + userId, UserDTO.class);
    }
}
