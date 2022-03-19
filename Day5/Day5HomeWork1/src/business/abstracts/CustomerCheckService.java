package business.abstracts;

import entities.concretes.Customer;

public interface CustomerCheckService {
    boolean checkName(Customer customer);
    boolean checkLastname(Customer customer);
    boolean checkEmail(Customer customer);
    boolean checkPassword(Customer customer);
    boolean checkCurrentEmail(Customer customer);
    boolean isValid( Customer customer);

}
