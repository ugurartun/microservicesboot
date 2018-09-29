package com.ugur.microservices.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by ugurartun on 27/07/18.
 */
@Getter
@Setter
@Entity
public class Address
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "country")
    private String countryName;

    @Column(name = "city")
    private String cityName;

    @Column(name = "town")
    private String townName;

    @Column(name = "quarter")
    private String quarterName;

    @Column(name = "district")
    private String districtName;

    @Column(name = "address_type")
    @Enumerated(EnumType.STRING)
    private AddressType addressType;

}
