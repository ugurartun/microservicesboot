package com.ugur.microservices.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by ugurartun on 27/07/18.
 */
@Entity
public class Address
{
    @Getter
    @Setter
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @NotNull
    @Column(name = "user_id")
    private Long userId;

    @Getter
    @Setter
    @Column(name = "country")
    private String countryName;

    @Getter
    @Setter
    @Column(name = "city")
    private String cityName;

    @Getter
    @Setter
    @Column(name = "town")
    private String townName;

    @Getter
    @Setter
    @Column(name = "quarter")
    private String quarterName;

    @Getter
    @Setter
    @Column(name = "district")
    private String districtName;

    @Getter
    @Setter
    @Column(name = "address_type")
    @Enumerated(EnumType.STRING)
    private AddressType addressType;

}
