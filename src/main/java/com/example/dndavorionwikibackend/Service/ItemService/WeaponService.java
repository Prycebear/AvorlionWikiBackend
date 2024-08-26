package com.example.dndavorionwikibackend.Service.ItemService;

import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import com.example.dndavorionwikibackend.Repositories.ItemRepository.WeaponRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeaponService {

    private WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    public Weapon save(Weapon weapon) throws Exception {
        Optional<Weapon> savedWeapon = weaponRepository.findById(weapon.getItemId());
        if(savedWeapon.isPresent()){
            throw new Exception("Weapon already exist with given name:" + weapon.getItemId());
        }
        return weaponRepository.save(weapon);
    }

    public List<Weapon> findAll() {
        return weaponRepository.findAll();
    }

    public Weapon findById(long weaponId) throws Exception {
        Optional<Weapon> weaponExist = weaponRepository.findById(weaponId);
        if(!weaponExist.isPresent()){
            throw new Exception("Weapon doesnt exist with given id");
        }
        return weaponRepository.findWeaponByItemId(weaponId);
    }

    public Weapon findByName(String weaponName){
        return weaponRepository.findWeaponByItemName(weaponName);
    }

    public void deleteById(long weaponId) {
        weaponRepository.deleteWeaponByItemId(weaponId);
    }
}
