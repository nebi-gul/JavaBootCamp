package Concretes;

import Abstracts.SalesService;
import Entities.Sales;

public class SalesManager implements SalesService{
	public void add(Sales sales) {
		System.out.println("Satýþ eklendi Oyuncu id : " +  sales.getGamerid());
	}
	
	public void remove(Sales sales) {
		System.out.println("Satýþ silindi : ");
	}
	
	public void update(Sales sales) {
		System.out.println("Kampanya güncellendi oyuncu id : " +  sales.getGamerid());
	}
}
