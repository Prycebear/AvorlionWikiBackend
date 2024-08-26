package com.example.dndavorionwikibackend.Repositories.CamapignRepository;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    Campaign findCampaignByCampaignId(long campaignId);

    Campaign findCampaignByCampaignName(String campaignName);

    Set<Campaign> findAllByCampaignType(String campaignType);
}
