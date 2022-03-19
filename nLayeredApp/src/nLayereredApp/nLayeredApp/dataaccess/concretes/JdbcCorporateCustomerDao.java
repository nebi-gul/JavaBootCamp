package nLayereredApp.nLayeredApp.dataaccess.concretes;

import nLayereredApp.nLayeredApp.dataaccess.abstracts.CorporateCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.CorporateCustomer;

import java.util.List;

public class JdbcCorporateCustomerDao implements CorporateCustomerDao {

    @Override
    public void add(CorporateCustomer customer) {
        System.out.println(customer.getCompanyName() + ": Jdbc Eklendi");

    }

    @Override
    public void delete(CorporateCustomer customer) {
        System.out.println(customer.getCompanyName() + ": Jdbc Silindi");

    }

    @Override
    public void update(CorporateCustomer customer) {
        System.out.println(customer.getCompanyName() + ": Jdbc Güncellendi");

    }

    @Override
    public List<CorporateCustomer> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
