package com.example.dndavorionwikibackend.Controller.CampaignController;

import com.example.dndavorionwikibackend.DTO.CampaignDTO.CampaignCardDTO;
import com.example.dndavorionwikibackend.DTO.CampaignDTO.CampaignDTO;
import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Service.CampaignService.CampaignService;
import com.example.dndavorionwikibackend.Translation.CampaignTranslator.CampaignTranslator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/campaign")
public class CampaingController {

    private final CampaignService campaignService;

    private final CampaignTranslator campaignTranslator;

    


    public CampaingController(CampaignTranslator campaignTranslator, CampaignService campaignService) {
        this.campaignService = campaignService;
        this.campaignTranslator = campaignTranslator;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addCampaign(@RequestBody Campaign campaign) throws Exception {
        campaignService.saveCampaign(campaign);
    }

    @CrossOrigin
    @GetMapping("/all/{campaign-type}")
    public Set<CampaignCardDTO> filterCampaignByCampaignType(@PathVariable("campaign-type") String campaignType) throws Exception {
        return campaignService.findAllByCampaignType(campaignType)
                .stream()
                .map(campaignTranslator::campaignToCampaignCardDTO)
                .collect(Collectors.toSet());
    }


    @CrossOrigin
    @GetMapping(value = "/card/all")
    public Set<CampaignCardDTO> listAll() {
        return campaignService.findAll()
                .stream()
                .map(campaignTranslator::campaignToCampaignCardDTO)
                .collect(Collectors.toSet());
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<CampaignDTO> listById(@PathVariable("id") long campaignId) {

        return ResponseEntity.ok(campaignTranslator.campaignToCampaignDTO(campaignService.findById(campaignId)));
    }
}
