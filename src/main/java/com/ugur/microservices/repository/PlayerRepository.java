package com.ugur.microservices.repository;

import com.ugur.microservices.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by ugurartun on 14/02/17.
 */
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long>
{
}
