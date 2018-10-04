package com.ugur.microservices.repository;

import com.ugur.microservices.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by ugurartun on 14/02/17.
 */
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long>
{
    List<Team> findByName(String name);
}
