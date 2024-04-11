package org.mhjabrane.foodservice.service.client;

import org.mhjabrane.foodservice.dto.Restaurant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("RESTAURANT-SERVICE")
public interface RestaurantFeignClient {

    @GetMapping(value = "/restaurant/fetchById/{id}",consumes = "application/json")
    public ResponseEntity<Restaurant>  findRestaurantById(@PathVariable Integer id);
}
