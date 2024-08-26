package com.example.dndavorionwikibackend.Controller.ItemController;


import com.example.dndavorionwikibackend.DTO.ItemsDTO.WeaponCardDTO;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Service.ItemService.WeaponService;
import com.example.dndavorionwikibackend.Service.SpeciesService.SpeciesService;
import com.example.dndavorionwikibackend.Translation.ItemTranslator.WeaponTranslator;
import com.example.dndavorionwikibackend.Translation.SpeciesTranslator.SpeciesTranslator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/items/weapons")
public class WeaponController {

    private final WeaponService weaponService;

    private final WeaponTranslator weaponTranslator;


    public WeaponController(WeaponService weaponService, WeaponTranslator weaponTranslator) {
        this.weaponService = weaponService;
        this.weaponTranslator = weaponTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addWeapon(@RequestBody Weapon weapon) throws Exception {
        weaponTranslator.weaponToWeaponsCardDTO(weaponService.save(weapon));
    }

//    @CrossOrigin
//    @GetMapping(value = "/all/cards")
//    public Set<WeaponCardDTO> listAll() {
//        return weaponService.findAll()
//                .stream()
//                .map(weaponTranslator::weaponToWeaponsCardDTO)
//                .collect(Collectors.toSet());
//    }



    @CrossOrigin
    @GetMapping(value = "/all/cards")
    public Set<WeaponCardDTO> listAll() {
        return weaponService.findAll()
                .stream()
                .map(weaponTranslator::weaponToWeaponsCardDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/weaponsId/{id}")
    public ResponseEntity<WeaponCardDTO> listById(@PathVariable("id") long weaponId) throws Exception {
        return ResponseEntity.ok(weaponTranslator.weaponToWeaponsCardDTO(weaponService.findById(weaponId)));
    }
}
