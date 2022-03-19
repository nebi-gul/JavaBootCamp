package Concretes;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean isValid(Gamer gamer) {
		if(!gamer.getFirstName().isEmpty() && !gamer.getLastName().isEmpty() && gamer.getNationalityId().length() != 11) {
			return false;
		}else {
			return true;
		}
	}
	
}
