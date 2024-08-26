package com.example.dndavorionwikibackend.Repositories.ItemRepository;

import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {

    Weapon findWeaponByItemName(long weaponName);

    Weapon findWeaponByItemId(long weaponId);

    Weapon findWeaponByItemName(String weaponName);

    void deleteWeaponByItemId(long weaponId);
}
