package concretes;


import abstracts.GamerService;
import entities.Game;
import entities.Gamer;


public class GameManager implements GamerService {
    public void add(Game game){
        System.out.println("Oyun eklendi: "+ game.getName()+"--"+ game.getDescription());

    }
    public void remove(Game game){
        System.out.println("Oyun silindi: "+ game.getName()+"-- "+ game.getDescription());

    }
    public void update(Game game){
        System.out.println("Oyun güncellendi...: "+ game.getName()+"-- "+ game.getDescription());

    }

    @Override
    public void add(Gamer gamer) {

    }

    @Override
    public void remove(Gamer gamer) {

    }

    @Override
    public void update(Gamer gamer) {

    }
}
