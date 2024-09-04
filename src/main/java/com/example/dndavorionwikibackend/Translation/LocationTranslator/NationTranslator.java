package com.example.dndavorionwikibackend.Translation.LocationTranslator;

import com.example.dndavorionwikibackend.DTO.LocationDTO.ContinentDTO;
import com.example.dndavorionwikibackend.DTO.LocationDTO.NationDTO;
import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.example.dndavorionwikibackend.Model.Locations.Nation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class NationTranslator {

    private ModelMapper modelMapper;

    public NationTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public NationDTO nationToNationDTO(Nation nation) {
        return modelMapper.map(nation, NationDTO.class);
    }

    public Nation nationDTOtoNation(NationDTO nationDTO) {
        return modelMapper.map(nationDTO, Nation.class);
    }
}
