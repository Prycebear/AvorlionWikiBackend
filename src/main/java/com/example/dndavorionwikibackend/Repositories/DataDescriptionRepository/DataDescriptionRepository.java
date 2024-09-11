package com.example.dndavorionwikibackend.Repositories.DataDescriptionRepository;

import com.example.dndavorionwikibackend.Model.DataDescriptions.DataDescription;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DataDescriptionRepository extends JpaRepository<DataDescription, Long> {

    DataDescription findByDataNameIgnoreCase(String dataName);
}
