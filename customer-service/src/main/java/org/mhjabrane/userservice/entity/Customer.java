package org.mhjabrane.userservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CUSTOMER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Customer {

    @Id
    @Column(name = "ID_CUSTOMER", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    @SequenceGenerator(name = "customer_generator", sequenceName = "customer_sequence", allocationSize = 1)
    private Long id;
    private String userName;
    private String userPassword;
    private String address;
    private String city;

}
