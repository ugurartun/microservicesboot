package com.ugur.microservices.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ugurartun on 27/07/18.
 */
@Getter
@Setter
@Entity
public class User
{
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phone_number", unique = true)
    private String phone;

}
