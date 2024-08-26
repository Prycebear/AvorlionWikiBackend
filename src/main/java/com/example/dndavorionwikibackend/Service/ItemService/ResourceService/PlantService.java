package com.example.dndavorionwikibackend.Service.ItemService.ResourceService;

import com.example.dndavorionwikibackend.Model.Items.Resources.Plant.Plant;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import com.example.dndavorionwikibackend.Repositories.ItemRepository.ResourceRepository.PlantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    private PlantRepository plantRepository;

    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }
    public Plant save(Plant plant) throws Exception {
        Optional<Plant> savedPlant = plantRepository.findById(plant.getResourceId());
        if(savedPlant.isPresent()){
            throw new Exception("Plant already exist with given name:" + plant.getResourceName());
        }
        return plantRepository.save(plant);
    }

    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }
}
