package org.mhjabrane.ordersservice.repo;

import org.mhjabrane.ordersservice.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer>{
 }

