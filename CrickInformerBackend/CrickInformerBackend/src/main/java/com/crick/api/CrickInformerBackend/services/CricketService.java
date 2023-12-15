package com.crick.api.CrickInformerBackend.services;

import com.crick.api.CrickInformerBackend.entities.Match;

import java.util.List;

public interface CricketService {
    List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();
}
