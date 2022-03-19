import java.time.LocalDate;

import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerCheckManager;
import Concretes.GamerManager;
import Concretes.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sales;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign(1, "Black Friday", "%40 indirim");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		Game game = new Game(1,"GTA","Görevleri tamamla",29.99);
		GameManager gameManager =new GameManager();
		gameManager.add(game);
		
		Gamer gamer = new Gamer(1,"Ali","Öz",LocalDate.parse("1985-01-06"),"12345678910");
		GamerManager gamerManager = new GamerManager();
		GamerCheckManager gamerCheckManager= new GamerCheckManager();
		if(gamerCheckManager.isValid(gamer)) {
			gamerManager.add(gamer);
		}else {
			System.out.println("Girilen bilgiler hatalý kayýt oluþturulmadý");
		}
		
		
		Sales sales = new Sales(1,1,1,1,19.99);
		SalesManager salesManager = new SalesManager();
		salesManager.add(sales);
	}

}
