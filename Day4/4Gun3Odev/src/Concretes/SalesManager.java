package Concretes;

import Abstracts.SalesService;
import Entities.Sales;

public class SalesManager implements SalesService{
	public void add(Sales sales) {
		System.out.println("Sat�� eklendi Oyuncu id : " +  sales.getGamerid());
	}
	
	public void remove(Sales sales) {
		System.out.println("Sat�� silindi : ");
	}
	
	public void update(Sales sales) {
		System.out.println("Kampanya g�ncellendi oyuncu id : " +  sales.getGamerid());
	}
}
