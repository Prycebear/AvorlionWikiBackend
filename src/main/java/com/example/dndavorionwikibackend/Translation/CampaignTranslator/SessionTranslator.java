package com.example.dndavorionwikibackend.Translation.CampaignTranslator;

import com.example.dndavorionwikibackend.DTO.CampaignDTO.SessionCardDTO;
import com.example.dndavorionwikibackend.DTO.CampaignDTO.SessionDTO;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Campaign.Session;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SessionTranslator {

    private ModelMapper modelMapper;

    public SessionTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public SessionCardDTO sessionToSessionCardDTO (Session session){
        return modelMapper.map(session, SessionCardDTO.class);
    }

    public Session SessionCardDTOToSpecies (SessionCardDTO sessionCardDTO){
        return modelMapper.map(sessionCardDTO, Session.class);
    }
}
