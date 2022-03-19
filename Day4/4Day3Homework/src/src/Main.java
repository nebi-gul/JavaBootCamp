import concretes.*;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sales;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Campaign campaign = new Campaign(1, "Muhteşem Nisan İndirimleri", "%40 indirim");
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.update(campaign);
        campaignManager.remove(campaign);

        Campaign campaign1=new Campaign(2,"Yeni kampanyalar","%30 indirim.");
        campaignManager.update(campaign1);
        System.out.println("***************************************************************");

        Game game = new Game(1,"Lord Of Company",200,"Etkileyici");
        GameManager gameManager =new GameManager();
        gameManager.add(game);
        gameManager.remove(game);

        System.out.println("***************************************************************");

        Gamer gamer = new Gamer(1," Nebi","GÜL", LocalDate.parse("1993-01-06"),"45678454212");
        Gamer gamer1=new Gamer(2,"Ahmet","Şahin",LocalDate.parse("1993-05-06"),"12456987896");
        GamerManager gamerManager = new GamerManager();
        GamerCheckManager gamerCheckManager= new GamerCheckManager();
        if(gamerCheckManager.isValid(gamer)) {
            gamerManager.add(gamer);

        }else {
            System.out.println("Girilen bilgiler hatalıdır.");
        }



        Sales sales = new Sales(1,1,1,200,1);
        SalesManager salesManager = new SalesManager();
        salesManager.add(sales);
        salesManager.update(sales);
    }
    }

