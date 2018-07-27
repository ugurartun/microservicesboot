package com.ugur.microservices.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by ugurartun on 27/07/18.
 */
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

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getTownName()
    {
        return townName;
    }

    public void setTownName(String townName)
    {
        this.townName = townName;
    }

    public String getQuarterName()
    {
        return quarterName;
    }

    public void setQuarterName(String quarterName)
    {
        this.quarterName = quarterName;
    }

    public String getDistrictName()
    {
        return districtName;
    }

    public void setDistrictName(String districtName)
    {
        this.districtName = districtName;
    }

    public AddressType getAddressType()
    {
        return addressType;
    }

    public void setAddressType(AddressType addressType)
    {
        this.addressType = addressType;
    }

}
