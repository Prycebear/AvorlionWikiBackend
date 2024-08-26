package com.example.dndavorionwikibackend.Translation.ItemTranslator.ResourceTranslator;

import com.example.dndavorionwikibackend.DTO.ItemsDTO.ResourceDTO.PlantDTO.PlantCardDTO;
import com.example.dndavorionwikibackend.DTO.ItemsDTO.WeaponCardDTO;
import com.example.dndavorionwikibackend.Model.Items.Resources.Plant.Plant;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PlantTranslator {


    private ModelMapper modelMapper;

    public PlantTranslator(ModelMapper modelMapper) {
        this.modelMapper = new ModelMapper();
    }

    public PlantCardDTO plantToPlantCardDTO(Plant plant) {
        return modelMapper.map(plant, PlantCardDTO.class);
    }

    public Plant PlantCardDTOToplant(PlantCardDTO plantCardDTO) {
        return modelMapper.map(plantCardDTO, Plant.class);
    }


}
