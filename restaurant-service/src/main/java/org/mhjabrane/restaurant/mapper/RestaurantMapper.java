package org.mhjabrane.restaurant.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mhjabrane.restaurant.dto.RestaurantDTO;
import org.mhjabrane.restaurant.entity.Restaurant;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
