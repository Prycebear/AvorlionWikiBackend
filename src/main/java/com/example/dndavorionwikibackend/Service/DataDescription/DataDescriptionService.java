package com.example.dndavorionwikibackend.Service.DataDescription;

import com.example.dndavorionwikibackend.Model.DataDescriptions.DataDescription;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Repositories.DataDescriptionRepository.DataDescriptionRepository;
import com.example.dndavorionwikibackend.Repositories.GodsRepository.GodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataDescriptionService {

    private DataDescriptionRepository dataDescriptionRepository;

    public DataDescriptionService(DataDescriptionRepository dataDescriptionRepository) {this.dataDescriptionRepository = dataDescriptionRepository;}

    public List<DataDescription> findAll() {
        return dataDescriptionRepository.findAll();
    }

    public DataDescription save(DataDescription dataDescription) throws Exception {
        Optional<DataDescription> savedDataDescription = dataDescriptionRepository.findById(dataDescription.getDataId());
        if(savedDataDescription.isPresent()){
            throw new Exception("Data already exist with given name:" + dataDescription.getDataName());
        } else if (dataDescription.getDataDescription().isEmpty()) {
            throw new Exception(dataDescription.getDataDescription() + " has no data");
        }

        return dataDescriptionRepository.save(dataDescription);
    }

    public DataDescription findByDataName(String dataName) {
        return dataDescriptionRepository.findByDataNameIgnoreCase(dataName);
    }
}
