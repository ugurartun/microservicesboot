package com.ugur.microservices.domain;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ugurartun on 14/02/17.
 */
@Entity
public class Player
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String position;
    private Long teamId;
    private int age;


    public Player()
    {
        super();
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", teamId=" + teamId +
                ", age=" + age +
                '}';
    }

    public Player(Long id, String name, String position, Long teamId, int age)
    {
        this();
        this.id = id;
        this.name = name;
        this.position = position;
        this.teamId = teamId;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getTeamId()
    {
        return teamId;
    }

    public void setTeamId(Long teamId)
    {
        this.teamId = teamId;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
