package com.example.dndavorionwikibackend.Controller.DataDescriptionController;

import com.example.dndavorionwikibackend.Model.DataDescriptions.DataDescription;
import com.example.dndavorionwikibackend.Service.DataDescription.DataDescriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/data")
public class DataDescriptionController {

    private final DataDescriptionService dataDescriptionService;


    public DataDescriptionController(DataDescriptionService dataDescriptionService) {
        this.dataDescriptionService = dataDescriptionService;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addData(@RequestBody DataDescription dataDescription) throws Exception {
        dataDescriptionService.save(dataDescription);
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<DataDescription> listAll() {
        return dataDescriptionService.findAll()
                .stream()
                .collect(Collectors.toSet());
    }

    @GetMapping("/{name}")
    public ResponseEntity<DataDescription> findByName(@PathVariable("name") String dataName) throws Exception {

        return ResponseEntity.ok(dataDescriptionService.findByDataName(dataName));
    }
}
