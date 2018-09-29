package com.ugur.microservices.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by ugurartun on 27/07/18.
 */
@Data
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
