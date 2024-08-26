package com.example.dndavorionwikibackend.Controller.ItemController.ResourceControllers;

import com.example.dndavorionwikibackend.DTO.ItemsDTO.ResourceDTO.PlantDTO.PlantCardDTO;
import com.example.dndavorionwikibackend.DTO.ItemsDTO.WeaponCardDTO;
import com.example.dndavorionwikibackend.Model.Items.Resources.Plant.Plant;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import com.example.dndavorionwikibackend.Service.ItemService.ResourceService.PlantService;
import com.example.dndavorionwikibackend.Translation.ItemTranslator.ResourceTranslator.PlantTranslator;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/resource/plants")
public class PlantController {

    private PlantService plantService;
    private PlantTranslator plantTranslator;

    public PlantController(PlantService plantService, PlantTranslator plantTranslator) {
        this.plantService = plantService;
        this.plantTranslator = plantTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addPlant(@RequestBody Plant plant) throws Exception {
        plantTranslator.plantToPlantCardDTO(plantService.save(plant));
    }

    @CrossOrigin
    @GetMapping(value = "/all/cards")
    public Set<PlantCardDTO> listAll() {
        return plantService.getAllPlants()
                .stream()
                .map(plantTranslator::plantToPlantCardDTO)
                .collect(Collectors.toSet());
    }
}
