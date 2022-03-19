package nLayereredApp.nLayeredApp.api;



import nLayereredApp.nLayeredApp.business.concretes.CorporateCustomerManager;
import nLayereredApp.nLayeredApp.business.concretes.IndividualCustomerManager;
import nLayereredApp.nLayeredApp.dataaccess.concretes.HibernateCorporateCustomerDao;
import nLayereredApp.nLayeredApp.dataaccess.concretes.HibernateIndividiualCustomerDao;
import nLayereredApp.nLayeredApp.dataaccess.concretes.JdbcCorporateCustomerDao;
import nLayereredApp.nLayeredApp.dataaccess.concretes.JdbcIndiviudalCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.CorporateCustomer;
import nLayereredApp.nLayeredApp.entities.concretes.IndividualCustomer;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer customer1 = new IndividualCustomer(1,"12345","Nebi","Gül","123456789");
        IndividualCustomer customer2 = new IndividualCustomer(2,"12335","Engin","Demiroğ","1234567811");
        IndividualCustomer customer3 = new IndividualCustomer(3,"123345","Engin","Demiroğ2","12345675811");


        IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager(new JdbcIndiviudalCustomerDao());
        individualCustomerManager.add(customer1);
        individualCustomerManager = new IndividualCustomerManager(new HibernateIndividiualCustomerDao());
        individualCustomerManager.add(customer1);

        CorporateCustomer customer4 = new CorporateCustomer(1,"ETIYA","DENEME","BAÞARILI");

        CorporateCustomerManager corporateCustomerManager = new CorporateCustomerManager(new HibernateCorporateCustomerDao());
        corporateCustomerManager.update(customer4);
        corporateCustomerManager = new CorporateCustomerManager(new JdbcCorporateCustomerDao());
        corporateCustomerManager.update(customer4);



//		for (IndividualCustomer customer: individualCustomerManager.getAll()) {
//			System.out.println(customer.getFirstName()+ customer.getId());
//		}

    }

}
