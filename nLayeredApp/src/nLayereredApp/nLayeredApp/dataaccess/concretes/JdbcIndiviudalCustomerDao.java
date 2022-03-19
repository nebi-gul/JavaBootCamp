package nLayereredApp.nLayeredApp.dataaccess.concretes;

import nLayereredApp.nLayeredApp.dataaccess.abstracts.IndividualCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.IndividualCustomer;

import java.util.List;

public class JdbcIndiviudalCustomerDao implements IndividualCustomerDao {

    @Override
    public void add(IndividualCustomer customer) {
        System.out.println(customer.getFirstName()+": Jdbc ile eklendi.");

    }

    @Override
    public void delete(IndividualCustomer customer) {
        System.out.println(customer.getFirstName()+": Jdbc ile silindi.");

    }

    @Override
    public void update(IndividualCustomer customer) {
        System.out.println(customer.getFirstName()+": Jdbc ile güncellendi.");

    }

    @Override
    public List<IndividualCustomer> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
