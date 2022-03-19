package nLayereredApp.nLayeredApp.business.concretes;

import nLayereredApp.nLayeredApp.dataaccess.abstracts.CorporateCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.CorporateCustomer;

import java.util.List;

public class CorporateCustomerManager {
    private CorporateCustomerDao corporateCustomerDao;

    public CorporateCustomerManager(CorporateCustomerDao corporateCustomerDao) {
        super();
        this.corporateCustomerDao = corporateCustomerDao;
    }

    public void add(CorporateCustomer customer) {
        corporateCustomerDao.add(customer);
    }
    public void delete(CorporateCustomer customer) {
        corporateCustomerDao.delete(customer);
    }
    public void update(CorporateCustomer customer) {
        corporateCustomerDao.update(customer);
    }

    public List<CorporateCustomer> getAll(){
        return corporateCustomerDao.getAll();
    }


}
