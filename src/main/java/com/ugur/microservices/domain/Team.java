package com.ugur.microservices.domain;

/**
 * Created by ugurartun on 14/02/17.
 */
public class Team
{
    private String name;
    private String location;
    private String mascotte;

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

}
