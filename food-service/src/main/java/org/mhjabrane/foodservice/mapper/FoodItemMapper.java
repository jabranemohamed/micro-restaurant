package org.mhjabrane.foodservice.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mhjabrane.foodservice.dto.FoodItemDTO;
import org.mhjabrane.foodservice.entity.FoodItem;

@Mapper
public interface FoodItemMapper {

    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);

    FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO);

    FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem);


}
