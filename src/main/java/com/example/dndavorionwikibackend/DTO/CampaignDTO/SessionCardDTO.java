package com.example.dndavorionwikibackend.DTO.CampaignDTO;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;

import java.util.Set;

public class SessionCardDTO {


    private long sessionId;

    private String sessionTitle;

    private String shortSessionDescription;


    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionTitle() {
        return sessionTitle;
    }

    public void setSessionTitle(String sessionTitle) {
        this.sessionTitle = sessionTitle;
    }

    public String getShortSessionDescription() {
        return shortSessionDescription;
    }

    public void setShortSessionDescription(String shortSessionDescription) {
        this.shortSessionDescription = shortSessionDescription;
    }


}
