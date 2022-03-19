package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import business.abstracts.CustomerVerificationService;
import core.concretes.GoogleManagerAdapter;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService {
    private CustomerDao customerDao;
    private CustomerCheckService customerCheckService;
    private CustomerVerificationService customerVerificationService;
    private GoogleManagerAdapter googleManagerAdapter;

    public CustomerManager(CustomerCheckService customerCheckService, CustomerVerificationService customerVerificationService,
                           GoogleManagerAdapter googleManagerAdapter) {

        super();
        this.customerCheckService = customerCheckService;
        this.customerVerificationService = customerVerificationService;
        this.googleManagerAdapter = googleManagerAdapter;
    }
    @Override
    public void signUp(Customer customer) {
        if (customerCheckService.isValid(customer)) {
            customerVerificationService.sendToVerifyMail(customer);
            customerVerificationService.verifyMail(customer);
            googleManagerAdapter.login(customer);

        } else {
            System.out.println("Lütfen bilgileri güncelleyerek tekrar deneyiniz.");
        }
    }
        @Override
        public void login (Customer customer){
            if (customerVerificationService.checkVerifyAccount(customer)) {
                System.out.println("Sisteme giriş yapıldı.");
            } else {
                System.out.println("Sisteme giriş yapılamadı.");
            }

        }


    }

