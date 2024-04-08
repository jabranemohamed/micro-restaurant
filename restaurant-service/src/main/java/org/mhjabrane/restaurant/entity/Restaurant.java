package org.mhjabrane.restaurant.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "restaurant_generator")
    @SequenceGenerator(name = "restaurant_generator", sequenceName = "restaurant_sequence", allocationSize = 1)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;

}
