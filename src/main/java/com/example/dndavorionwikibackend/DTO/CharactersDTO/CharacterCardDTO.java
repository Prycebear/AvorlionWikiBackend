package com.example.dndavorionwikibackend.DTO.CharactersDTO;

import com.example.dndavorionwikibackend.Model.Species.Species;

public class CharacterCardDTO {

    private long characterId;

    private String characterFirstName;

    private String characterLastName;

    private String shortCharacterDescription;

    private Species species;

    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getCharacterFirstName() {
        return characterFirstName;
    }

    public void setCharacterFirstName(String characterFirstName) {
        this.characterFirstName = characterFirstName;
    }

    public String getCharacterLastName() {
        return characterLastName;
    }

    public void setCharacterLastName(String characterLastName) {
        this.characterLastName = characterLastName;
    }

    public String getShortCharacterDescription() {
        return shortCharacterDescription;
    }

    public void setShortCharacterDescription(String shortCharacterDescription) {
        this.shortCharacterDescription = shortCharacterDescription;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
