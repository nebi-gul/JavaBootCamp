import business.abstracts.CustomerVerificationService;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public class MailVerificationManager implements CustomerVerificationService {

        List<Customer> verifiedMails = new ArrayList<Customer>();

        @Override
        public void sendToVerifyMail(Customer customer) {
            verifiedMails.add(customer);
            System.out.println("Doðrulama maili gönderildi: " + customer.geteMail());;

        }

        @Override
        public void verifyMail(Customer customer) {
            System.out.println(customer.geteMail() + " mail adresi basarýyla doðrulandý!");
        }

        @Override
        public boolean checkVerifyAccount(Customer customer) {
            if (verifiedMails.contains(customer)){
                return true;
            }
            return false;
        }

    }
}
