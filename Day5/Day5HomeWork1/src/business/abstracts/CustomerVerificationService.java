package business.abstracts;

import entities.concretes.Customer;

public interface CustomerVerificationService {
    void sendToVerifyMail(Customer customer);

    void verifyMail(Customer customer);

    boolean checkVerifyAccount(Customer customer);
}
