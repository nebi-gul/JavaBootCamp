package nLayereredApp.nLayeredApp.dataaccess.concretes;

import nLayereredApp.nLayeredApp.dataaccess.abstracts.IndividualCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.IndividualCustomer;

import java.util.List;

public class HibernateIndividiualCustomerDao implements IndividualCustomerDao {

    @Override
    public void add(IndividualCustomer customer) {
        System.out.println(customer.getFirstName()+": Hibernate ile eklendi.");

    }

    @Override
    public void delete(IndividualCustomer customer) {
        System.out.println(customer.getFirstName()+": Hibernate ile eklendi.");

    }

    @Override
    public void update(IndividualCustomer customer) {
        System.out.println(customer.getFirstName()+": Hibernate ile eklendi.");

    }

    @Override
    public List<IndividualCustomer> getAll(){
        return null;
    }

}
