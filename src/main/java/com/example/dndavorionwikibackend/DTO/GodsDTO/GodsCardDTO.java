package com.example.dndavorionwikibackend.DTO.GodsDTO;

public class GodsCardDTO {

    private Long godsId;

    private String godsName;

    private String godsDomain;

    private String godLevel;

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
}
