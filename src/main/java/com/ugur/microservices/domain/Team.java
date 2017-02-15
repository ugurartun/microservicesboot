package com.ugur.microservices.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by ugurartun on 14/02/17.
 */
@Entity
public class Team
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String mascotte;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="teamId")
    private Set<Player> players;

    public Team()
    {
        super();
    }

    public Team(Long id, String name, String location, Set<Player> players)
    {
        this();
        this.id = id;
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getMascotte()
    {
        return mascotte;
    }

    public void setMascotte(String mascotte)
    {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayers()
    {
        return players;
    }

    public void setPlayers(Set<Player> players)
    {
        this.players = players;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }


}
