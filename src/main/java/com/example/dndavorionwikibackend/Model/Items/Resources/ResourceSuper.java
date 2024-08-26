package com.example.dndavorionwikibackend.Model.Items.Resources;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;
import jakarta.persistence.*;

@MappedSuperclass
public class ResourceSuper {

    public enum resourceRarity{
        ABUNDANT, COMMON, UNCOMMON, RARE, LEGENDARY;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESOURCE_ID", nullable = false, unique = true)
    private long resourceId;

    private String resourceName;

    private String resourceDescription;

    private int value;

    private int totalResourceAmount;

    private resourceRarity resourceRarity;

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

    public int getTotalResourceAmount() {
        return totalResourceAmount;
    }

    public void setTotalResourceAmount(int totalResourceAmount) {
        this.totalResourceAmount = totalResourceAmount;
    }

    public ResourceSuper.resourceRarity getResourceRarity() {
        return resourceRarity;
    }

    public void setResourceRarity(ResourceSuper.resourceRarity resourceRarity) {
        this.resourceRarity = resourceRarity;
    }
}
