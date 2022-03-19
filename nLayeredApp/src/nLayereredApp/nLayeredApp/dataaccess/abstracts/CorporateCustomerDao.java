package nLayereredApp.nLayeredApp.dataaccess.abstracts;

import nLayereredApp.nLayeredApp.entities.concretes.CorporateCustomer;

import java.util.List;

public interface CorporateCustomerDao {

    void add(CorporateCustomer customer);
    void delete(CorporateCustomer customer);
    void update(CorporateCustomer customer);
    List<CorporateCustomer> getAll();
}
