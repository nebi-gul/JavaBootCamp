package core.concretes;

import core.abstracts.LoginService;
import entities.concretes.Customer;
import google.GoogleManager;

public class GoogleManagerAdapter implements LoginService {

    @Override
    public void login(Customer customer) {
        GoogleManager googleManager=new GoogleManager();
        googleManager.loginWithGoogle(customer.geteMail());

    }
}
