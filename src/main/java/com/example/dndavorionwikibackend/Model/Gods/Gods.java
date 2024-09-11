package com.example.dndavorionwikibackend.Model.Gods;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "GODS")
public class Gods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GODS_ID", nullable = false, unique = true)
    private Long godsId;

    @Column(name = "GODS_NAME")
    private String godsName;

    @Column(columnDefinition = "TEXT", name = "GODS_DESCRIPTION")
    private String godsDescription;

    @Column(name = "GODS_DOMAIN")
    private String godsDomain;

    @Column(name = "GODS_LEVEL")
    private String godLevel;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "GODS_ID")
    private Set<PlayerCharacter> characterGod;


    public Long getGodsId() {
        return godsId;
    }

    public void setGodsId(Long godsId) {
        this.godsId = godsId;
    }

    public String getGodsName() {
        return godsName;
    }

    public void setGodsName(String godsName) {
        this.godsName = godsName;
    }

    public String getGodsDescription() {
        return godsDescription;
    }

    public void setGodsDescription(String godsDescription) {
        this.godsDescription = godsDescription;
    }

    public String getGodsDomain() {
        return godsDomain;
    }

    public void setGodsDomain(String godsDomain) {
        this.godsDomain = godsDomain;
    }

    public String getGodLevel() {
        return godLevel;
    }

    public void setGodLevel(String godLevel) {
        this.godLevel = godLevel;
    }

    public Set<PlayerCharacter> getCharacterGod() {
        return characterGod;
    }

    public void setCharacterGod(Set<PlayerCharacter> characterGod) {
        this.characterGod = characterGod;
    }


}
