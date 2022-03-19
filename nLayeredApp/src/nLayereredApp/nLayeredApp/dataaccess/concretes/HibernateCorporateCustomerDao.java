package nLayereredApp.nLayeredApp.dataaccess.concretes;

import nLayereredApp.nLayeredApp.dataaccess.abstracts.CorporateCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.CorporateCustomer;

import java.util.List;

public class HibernateCorporateCustomerDao implements CorporateCustomerDao {

    @Override
    public void add(CorporateCustomer customer) {
        System.out.println(customer.getCompanyName() + ": Hibernate Eklendi");

    }

    @Override
    public void delete(CorporateCustomer customer) {
        System.out.println(customer.getCompanyName() + ": Hibernate Silindi");

    }

    @Override
    public void update(CorporateCustomer customer) {
        System.out.println(customer.getCompanyName() + ": Hibernate Güncellendi");

    }

    @Override
    public List<CorporateCustomer> getAll() {
        return null;
    }


}
