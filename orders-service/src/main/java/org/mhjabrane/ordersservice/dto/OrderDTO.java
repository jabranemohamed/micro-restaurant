package org.mhjabrane.ordersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private org.mhjabrane.ordersservice.dto.Restaurant restaurant;
    private org.mhjabrane.ordersservice.dto.UserDTO userDTO;
}
