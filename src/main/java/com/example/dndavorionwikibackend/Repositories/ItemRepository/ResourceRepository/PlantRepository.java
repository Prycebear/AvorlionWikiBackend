package com.example.dndavorionwikibackend.Repositories.ItemRepository.ResourceRepository;

import com.example.dndavorionwikibackend.Model.Items.Resources.Plant.Plant;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository  extends JpaRepository<Plant, Long> {


}
