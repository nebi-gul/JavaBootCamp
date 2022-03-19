package concretes;

import abstracts.CampaingService;
import entities.Campaign;

import java.util.ArrayList;
import java.util.List;


public class CampaignManager implements CampaingService {
        List<Campaign> campaigns=new ArrayList<>();




        public void add(Campaign campaign){
            this.campaigns.add(campaign);

            System.out.println("Kampanya eklendi: "+ campaign.getName()+" "+campaign.getDescription());

        }
        public void remove(Campaign campaign){
            System.out.println("Kampanya silindi: "+ campaign.getName()+" "+campaign.getDescription());

        }
        public void update(Campaign campaign){
            System.out.println("Kampanya güncellendi...: "+ campaign.getName()+" "+campaign.getDescription());

        }

    }
