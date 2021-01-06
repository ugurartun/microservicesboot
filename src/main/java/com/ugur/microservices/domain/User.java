package com.ugur.microservices.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ugurartun on 27/07/18.
 */
@ToString
@Entity
public class User
{
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @Column(name = "user_name")
    private String username;
    @Getter
    @Setter
    @Column(name = "name")
    private String name;
    @Getter
    @Setter
    @Column(name = "surname")
    private String surname;
    @Getter
    @Setter
    @Column(name = "phone_number", unique = true)
    private String phone;

}
