package org.mhjabrane.foodservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mhjabrane.foodservice.entity.FoodItem;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodCataloguePage {

    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;
}
