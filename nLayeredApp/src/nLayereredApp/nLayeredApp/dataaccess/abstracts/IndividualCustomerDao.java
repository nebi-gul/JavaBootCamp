package nLayereredApp.nLayeredApp.dataaccess.abstracts;

import nLayereredApp.nLayeredApp.entities.concretes.IndividualCustomer;

import java.util.List;

public interface IndividualCustomerDao {

    void add(IndividualCustomer customer);
    void delete(IndividualCustomer customer);
    void update(IndividualCustomer customer);
    List <IndividualCustomer> getAll();

}
