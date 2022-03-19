package abstracts;

import entities.Game;

public interface GameService {
    public void add(Game game);

    public void remove(Game game);

    public void update(Game game);
}
