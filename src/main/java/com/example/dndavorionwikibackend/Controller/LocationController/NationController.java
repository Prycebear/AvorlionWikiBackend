package com.example.dndavorionwikibackend.Controller.LocationController;

import com.example.dndavorionwikibackend.DTO.LocationDTO.NationDTO;
import com.example.dndavorionwikibackend.Model.Locations.Nation;
import com.example.dndavorionwikibackend.Service.LocationService.NationService;
import com.example.dndavorionwikibackend.Translation.LocationTranslator.NationTranslator;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/location/nation")
public class NationController {

    private final NationService nationService;

    private final NationTranslator nationTranslator;

    public NationController(NationService nationService, NationTranslator nationTranslator) {
        this.nationService = nationService;
        this.nationTranslator = nationTranslator;
    }


    @CrossOrigin
    @PostMapping("/add")
    public void addNation(@RequestBody Nation nation) throws Exception {
        nationTranslator.nationToNationDTO(nationService.save(nation));
    }


    @CrossOrigin
    @GetMapping(value = "/all")
    public Set<NationDTO> listAll() {
        return nationService.findAll()
                .stream()
                .map(nationTranslator::nationToNationDTO)
                .collect(Collectors.toSet());
    }
}
