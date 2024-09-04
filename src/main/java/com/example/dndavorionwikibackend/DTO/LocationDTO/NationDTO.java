package com.example.dndavorionwikibackend.DTO.LocationDTO;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import com.example.dndavorionwikibackend.Model.Locations.Nation;
import com.example.dndavorionwikibackend.Model.Locations.SubNation;

import java.util.Set;

public class NationDTO {

    private long locationId;

    private String locationName;


    private String shortLocationDescription;


    private String locationDescription;


    private NonPlayerCharacter leaderId;

    private Set<SubNation> nations;
}
