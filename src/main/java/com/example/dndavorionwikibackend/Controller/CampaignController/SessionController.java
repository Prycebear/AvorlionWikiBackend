package com.example.dndavorionwikibackend.Controller.CampaignController;


import com.example.dndavorionwikibackend.DTO.CampaignDTO.SessionCardDTO;

import com.example.dndavorionwikibackend.Model.Campaign.Session;

import com.example.dndavorionwikibackend.Service.CampaignService.SessionService;

import com.example.dndavorionwikibackend.Translation.CampaignTranslator.SessionTranslator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/session")
public class SessionController {

    private final SessionService sessionService;

    private final SessionTranslator sessionTranslator;

    public SessionController(SessionService sessionService, SessionTranslator sessionTranslator) {
        this.sessionService = sessionService;
        this.sessionTranslator = sessionTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addSession(@RequestBody Session session) throws Exception {
        sessionService.saveSession(session);
    }

    @CrossOrigin
    @GetMapping(value = "/card/all")
    public Set<SessionCardDTO> listAll() {
        return sessionService.findAll()
                .stream()
                .map(sessionTranslator::sessionToSessionCardDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<SessionCardDTO> listById(@PathVariable("id") long sessionId) {

        return ResponseEntity.ok(sessionTranslator.sessionToSessionCardDTO(sessionService.getSessionBySessionId(sessionId)));
    }
}
