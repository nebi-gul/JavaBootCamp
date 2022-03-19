package nLayereredApp.nLayeredApp.business.concretes;

import nLayereredApp.nLayeredApp.dataaccess.abstracts.IndividualCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.IndividualCustomer;

import java.util.List;

public class IndividualCustomerManager {
    private IndividualCustomerDao individualCustomerDao;

    public IndividualCustomerManager(IndividualCustomerDao individualCustomerDao) {
        super();
        this.individualCustomerDao = individualCustomerDao;
    }

    public void add(IndividualCustomer customer) {
        individualCustomerDao.add(customer);
    }

    public void delete(IndividualCustomer customer) {
        individualCustomerDao.delete(customer);
    }

    public List<IndividualCustomer> getAll(){

        return individualCustomerDao.getAll();
    }

}

//Bir e ticaret sistemi yazmak istiyoruz
//katmanlý mimari kullanacaðýz
//Katmanlarý oluþturunuz
//Ürün ekleme silme listeleme günelleme listeleme
//ürünler eklenirken daha önce o ürün ismi eklenmiþþe , ekleme gerçekleþmemeli
