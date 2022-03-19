package abstracts;

import entities.Gamer;

public interface GamerService {
    public void add(Gamer gamer);

    public void remove(Gamer gamer);

    public void update(Gamer gamer);
}
