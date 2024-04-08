package org.mhjabrane.userservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mhjabrane.userservice.dto.CustomerDTO;
import org.mhjabrane.userservice.entity.Customer;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer mapUserDTOToUser(CustomerDTO customerDTO);
    CustomerDTO mapUserToUserDTO(Customer customer);

}
