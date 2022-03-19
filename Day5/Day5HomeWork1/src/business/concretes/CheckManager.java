package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CheckManager implements CustomerCheckService {


    List<String > AllEmails=new ArrayList<String>();


    @Override
    public boolean checkName(Customer customer) {
        if(customer.getName().isEmpty()){
            System.out.println("İsim alanı boş bırakıldı. Lütfen tekrar deneyin.");
            return false;
        }
        else if(customer.getName().length()<2){
            System.out.println("İsim minimum 2 karakterden oluşmalıdır.");
            return false;
        }
        return true;


    }

    @Override
    public boolean checkLastname(Customer customer) {
       if(customer.getLastName().isEmpty()){
           System.out.println("Soyisim bilgisi boş bırakılamaz. Lütfen tekrar deneyiniz.");
           return false;

       }
       else if(customer.getLastName().length()<2){
           System.out.println("Soyizim bilgisi mimum 2 karakterden oluşmalıdır...");
           return false;
       }
       return true;


    }

    @Override
    public boolean checkEmail(Customer customer) {
        String regex= "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        if(customer.geteMail().isEmpty()){
            System.out.println("E mail bilgisi boş. Lütfen tekrar deneyiniz...");
            return false;
        }
        else  if(!pattern.matcher(customer.geteMail()).find()){
            System.out.println("E mail bilgisi formata uyumuyor!!!!");
            return false;
        }

        return true;
    }

    @Override
    public boolean checkPassword(Customer customer) {
        if(customer.getPassword().isEmpty()) {
            System.out.println("Þifre bilgisi boþ býrakýlamaz! Yeniden dene.");
            return false;
        }
        else if(customer.getPassword().length() <6) {
            System.out.println("Þifre bilgisi minimum 6 karakter olmalýdýr!");
            return false;
        }
        return true;



    }

    @Override
    public boolean checkCurrentEmail(Customer customer) {
        if(AllEmails.contains(customer.geteMail())) {
            System.out.println("Bu email adresi ile sistemde bir hesap bulunuyor! Farklı bir email adresi ile  dene.");
            return false;
        }
        else{
            AllEmails.add(customer.geteMail());
            return true;
        }
    }

    @Override
    public boolean isValid(Customer customer) {

        if (checkName(customer) && checkLastname(customer) && checkEmail(customer) && checkPassword(customer)
                && checkCurrentEmail(customer)) {
            return true;
        }
        return false;
    }
    }

