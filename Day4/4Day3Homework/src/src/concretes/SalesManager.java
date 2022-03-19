package concretes;



import abstracts.SalesService;
import entities.Sales;

public class SalesManager implements SalesService {
    public void add(Sales sales){
        System.out.println("Satış eklendi. Oyuncu id: "+ sales.getGamerId()+" / " + "Kampanya: " +" "+sales.getCampaignId());

    }
    public void remove(Sales sales){
        System.out.println("Satış silindi.");

    }
    public void update(Sales sales){
        System.out.println("Satış  güncellendi...: "+" "+sales.getGamerId()+" " +sales.getGamerId());

    }
}
