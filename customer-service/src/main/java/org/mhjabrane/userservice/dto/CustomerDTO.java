package org.mhjabrane.userservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private int userId;
    private String userName;
    private String userPassword;
    private String address;
    private String city;
}
