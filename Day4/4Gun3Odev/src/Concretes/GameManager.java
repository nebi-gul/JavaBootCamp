package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyuncu eklendi : " +  game.getName());
	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyuncu silindi : " +  game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyuncu güncellendi : " +  game.getName());
	}

}
