package com.ugur.microservices;

import com.ugur.microservices.domain.Player;
import com.ugur.microservices.domain.Team;
import com.ugur.microservices.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MicroservicesbootApplication {

	@Autowired
	private 	TeamRepository teamRepository;

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		Player player = new Player();
		player.setName("Mark");
		player.setPosition("goalkeeper");
		player.setTeamId(1L);

		teamRepository.save(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesbootApplication.class, args);
	}
}
