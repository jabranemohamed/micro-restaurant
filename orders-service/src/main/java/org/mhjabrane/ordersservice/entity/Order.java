package org.mhjabrane.ordersservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mhjabrane.ordersservice.dto.FoodItemsDTO;
import org.mhjabrane.ordersservice.dto.Restaurant;
import org.mhjabrane.ordersservice.dto.UserDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
