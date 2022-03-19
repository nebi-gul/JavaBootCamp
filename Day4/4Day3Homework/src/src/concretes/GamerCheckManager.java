package concretes;

import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

    @Override
    public boolean isValid(Gamer gamer) {
        if (!gamer.getLastname().isEmpty() && !gamer.getLastname().isEmpty() && gamer.getNationalityId().length() != 11) {
            return false;
        } else {
            return true;
        }
    }

}
