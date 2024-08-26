package com.example.dndavorionwikibackend.DTO.ItemsDTO.ResourceDTO.PlantDTO;

import com.example.dndavorionwikibackend.Model.Items.Resources.Plant.Plant;

public class PlantCardDTO {
    private long resourceId;

    private String resourceName;

    private String resourceDescription;

    private int value;

    private Plant.plantType plantType;

    public long getResourceId() {
        return resourceId;
    }

    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Plant.plantType getPlantType() {
        return plantType;
    }

    public void setPlantType(Plant.plantType plantType) {
        this.plantType = plantType;
    }
}
