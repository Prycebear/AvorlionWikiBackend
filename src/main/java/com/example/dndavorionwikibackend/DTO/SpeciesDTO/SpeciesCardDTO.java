package com.example.dndavorionwikibackend.DTO.SpeciesDTO;

public class SpeciesCardDTO {

    private long speciesId;
    public String speciesName;

    public String speciesShortDescription;

    private String speciesImgLink;

    public long getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(long speciesId) {
        this.speciesId = speciesId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesShortDescription() {
        return speciesShortDescription;
    }

    public void setSpeciesShortDescription(String speciesShortDescription) {
        this.speciesShortDescription = speciesShortDescription;
    }

    public String getSpeciesImgLink() {
        return speciesImgLink;
    }

    public void setSpeciesImgLink(String speciesImgLink) {
        this.speciesImgLink = speciesImgLink;
    }
}
