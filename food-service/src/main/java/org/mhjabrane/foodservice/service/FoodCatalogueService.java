package org.mhjabrane.foodservice.service;

import org.mhjabrane.foodservice.dto.FoodCataloguePage;
import org.mhjabrane.foodservice.dto.FoodItemDTO;
import org.mhjabrane.foodservice.dto.Restaurant;
import org.mhjabrane.foodservice.entity.FoodItem;
import org.mhjabrane.foodservice.mapper.FoodItemMapper;
import org.mhjabrane.foodservice.repo.FoodItemRepo;
import org.mhjabrane.foodservice.service.client.RestaurantFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FoodCatalogueService {

    @Autowired
    FoodItemRepo foodItemRepo;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RestaurantFeignClient restaurantFeignClient;


    public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO) {
        FoodItem foodItemSavedInDB = foodItemRepo.save(FoodItemMapper.INSTANCE.mapFoodItemDTOToFoodItem(foodItemDTO));
        return FoodItemMapper.INSTANCE.mapFoodItemToFoodItemDto(foodItemSavedInDB);
    }

    public FoodCataloguePage fetchFoodCataloguePageDetails(Integer restaurantId) {
        List<FoodItem> foodItemList =  fetchFoodItemList(restaurantId);
        Restaurant restaurant = fetchRestaurantDetailsFromRestaurantMS(restaurantId);
        return createFoodCataloguePage(foodItemList, restaurant);
    }

    private FoodCataloguePage createFoodCataloguePage(List<FoodItem> foodItemList, Restaurant restaurant) {
        FoodCataloguePage foodCataloguePage = new FoodCataloguePage();
        foodCataloguePage.setFoodItemsList(foodItemList);
        foodCataloguePage.setRestaurant(restaurant);
        return foodCataloguePage;
    }

    private Restaurant fetchRestaurantDetailsFromRestaurantMS(Integer restaurantId) {
        ResponseEntity<Restaurant> restaurantById = restaurantFeignClient.findRestaurantById(restaurantId);
        return restaurantById.getBody();
    }

    private List<FoodItem> fetchFoodItemList(Integer restaurantId) {
        return foodItemRepo.findByRestaurantId(restaurantId);
    }


}
