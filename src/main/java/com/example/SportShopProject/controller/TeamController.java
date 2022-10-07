package com.example.SportShopProject.controller;

import com.example.SportShopProject.dto.RequestSaveTeam;
import com.example.SportShopProject.dto.ResponseTeam;
import com.example.SportShopProject.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @PostMapping
    public ResponseEntity<?> saveTeamController(@RequestBody RequestSaveTeam requestSaveteam) {
        teamService.newSaveTeam(requestSaveteam);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<ResponseTeam>> getTeamsController() {
        return new ResponseEntity<>(teamService.getAllTeams(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<ResponseTeam> getByIdTeamController(@PathVariable Long id) {
        return new ResponseEntity<>(teamService.getByTeamId(id), HttpStatus.OK);
    }
}
