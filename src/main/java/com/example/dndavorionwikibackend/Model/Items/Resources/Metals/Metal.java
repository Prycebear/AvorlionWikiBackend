package com.example.dndavorionwikibackend.Model.Items.Resources.Metals;

import com.example.dndavorionwikibackend.Model.Items.Resources.ResourceSuper;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "METALS")
public class Metal extends ResourceSuper {

    public enum metalType{
        ORE,
        ALLOY
    }

    public enum metalEffects{
        INDESTRUCTIBLE
    }

    private metalType metalType;

    private Set<metalEffects> metalEffects;

    public Metal.metalType getMetalType() {
        return metalType;
    }

    public void setMetalType(Metal.metalType metalType) {
        this.metalType = metalType;
    }

    public Set<Metal.metalEffects> getMetalEffects() {
        return metalEffects;
    }

    public void setMetalEffects(Set<Metal.metalEffects> metalEffects) {
        this.metalEffects = metalEffects;
    }
}
