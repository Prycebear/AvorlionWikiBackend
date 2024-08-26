package com.example.dndavorionwikibackend.Service.CampaignService;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Repositories.CamapignRepository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CampaignService {

    private CampaignRepository campaignRepository;

    public CampaignService(CampaignRepository campaignRepository) {this.campaignRepository = campaignRepository;
    }

    public Campaign saveCampaign(Campaign campaign) throws Exception {
        Optional<Campaign> savedCampaign = campaignRepository.findById(campaign.getCampaignId());
        if(savedCampaign.isPresent()){
            throw new Exception("Species already exist with given name:" + campaign.getCampaignName());
        }
        return campaignRepository.save(campaign);
    }

    public Set<Campaign> findAllByCampaignType(String campaignType) throws Exception {
        return campaignRepository.findAllByCampaignType(campaignType);
    }

    public List<Campaign> findAll() {
        return campaignRepository.findAll();
    }

    public Campaign findById(long campaignId) {
        return campaignRepository.findCampaignByCampaignId(campaignId);
    }

    public Campaign findByName(String campaignName){
        return campaignRepository.findCampaignByCampaignName(campaignName);
    }

}
