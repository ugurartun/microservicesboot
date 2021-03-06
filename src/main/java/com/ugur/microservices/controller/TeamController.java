package com.ugur.microservices.controller;

import com.ugur.microservices.domain.Team;
import com.ugur.microservices.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ugurartun on 14/02/17.
 */
@RestController
public class TeamController
{

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping
    public Iterable<Team> getTeams()
    {
        return teamRepository.findAll();
    }

    @GetMapping("/team/{name}")
    public Iterable<Team> getTeams(@PathVariable String name)
    {
        return teamRepository.findByName(name);
    }

    @GetMapping("/teams/{id}")
    public Team getTeams(@PathVariable Long id)
    {
        return teamRepository.findOne(id);
    }
}
