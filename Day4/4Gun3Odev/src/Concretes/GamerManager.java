package Concretes;

import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi : " +  gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println("Oyuncu silindi : " +  gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " +  gamer.getFirstName() + " " + gamer.getLastName());
	}

}
