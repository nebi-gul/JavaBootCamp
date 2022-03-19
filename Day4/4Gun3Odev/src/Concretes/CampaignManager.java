package Concretes;

import Abstracts.CampaingService;
import Entities.Campaign;

public class CampaignManager implements CampaingService{
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " +  campaign.getName());
	}
	
	public void remove(Campaign campaign) {
		System.out.println("Kampanya silindi : " +  campaign.getName());
	}
	
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " +  campaign.getName());
	}
}
