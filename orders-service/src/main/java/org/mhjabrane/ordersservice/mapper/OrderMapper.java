package org.mhjabrane.ordersservice.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mhjabrane.ordersservice.dto.OrderDTO;
import org.mhjabrane.ordersservice.entity.Order;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}
