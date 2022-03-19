package concretes;

import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {
    public void add(Gamer gamer){
        System.out.println("Oyuncu eklendi: "+ gamer.getFirstname()+" "+gamer.getLastname());

    }
    public void remove(Gamer gamer){


        System.out.println("Oyuncu silindi: "+ gamer.getFirstname()+" "+gamer.getLastname());

    }
    public void update(Gamer gamer){
        System.out.println("Oyuncu güncellendi...: "+ gamer.getFirstname()+" "+gamer.getLastname());

    }
}
