package com.example.dndavorionwikibackend.Model.DataDescriptions;

import jakarta.persistence.*;

@Entity
@Table(name = "DATA_DESCRIPTION")
public class DataDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DATA_DESCRIPTION_ID", nullable = false, unique = true)
    private Long dataId;

    @Column(columnDefinition = "TEXT", name = "DATA_NAME")
    private String dataName;

    @Column(columnDefinition = "TEXT", name = "DATA_DESCRIPTION")
    private String dataDescription;


    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataDescription() {
        return dataDescription;
    }

    public void setDataDescription(String dataDescription) {
        this.dataDescription = dataDescription;
    }
}
