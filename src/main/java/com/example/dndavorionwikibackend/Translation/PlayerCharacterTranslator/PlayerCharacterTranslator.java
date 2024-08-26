package com.example.dndavorionwikibackend.Translation.PlayerCharacterTranslator;

import com.example.dndavorionwikibackend.DTO.CharactersDTO.CharacterCardDTO;
import com.example.dndavorionwikibackend.DTO.CharactersDTO.PlayerCharacterDTO;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PlayerCharacterTranslator {

    private ModelMapper modelMapper;

    public PlayerCharacterTranslator(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PlayerCharacterDTO playerCharacterToPlayerCharacterDTO (PlayerCharacter playerCharacter){
        return modelMapper.map(playerCharacter, PlayerCharacterDTO.class);
    }

    public CharacterCardDTO playerCharacterToCharacterCardDTO (PlayerCharacter playerCharacter){
        return modelMapper.map(playerCharacter, CharacterCardDTO.class);
    }

    public PlayerCharacter playerCharacterDTOtoPlayerCharacter (PlayerCharacterDTO playerCharacterDTO){
        return modelMapper.map(playerCharacterDTO, PlayerCharacter.class);
    }
}
