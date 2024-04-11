package org.mhjabrane.restaurant.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mhjabrane.restaurant.dto.RestaurantDTO;
import org.mhjabrane.restaurant.entity.Restaurant;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "restaurantDescription", target = "restaurantDescription")
    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "restaurantDescription", target = "restaurantDescription")
    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);


}
