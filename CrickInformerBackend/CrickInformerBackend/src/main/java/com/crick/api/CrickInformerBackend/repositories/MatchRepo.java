package com.crick.api.CrickInformerBackend.repositories;

import com.crick.api.CrickInformerBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<com.crick.api.CrickInformerBackend.entities.Match,Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);
}
