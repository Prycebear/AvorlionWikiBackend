package com.example.dndavorionwikibackend.Translation.ItemTranslator;

import com.example.dndavorionwikibackend.DTO.GodsDTO.GodsCardDTO;
import com.example.dndavorionwikibackend.DTO.GodsDTO.GodsDTO;
import com.example.dndavorionwikibackend.DTO.ItemsDTO.WeaponCardDTO;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class WeaponTranslator {
    private ModelMapper modelMapper;

    public WeaponTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public WeaponCardDTO weaponToWeaponsCardDTO (Weapon weapon){
        return modelMapper.map(weapon, WeaponCardDTO.class);
    }

    public Weapon godsDTOToGods (WeaponCardDTO weaponCardDTO){
        return modelMapper.map(weaponCardDTO, Weapon.class);
    }

}
