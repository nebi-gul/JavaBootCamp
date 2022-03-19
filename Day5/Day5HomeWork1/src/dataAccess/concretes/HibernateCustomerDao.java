package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerDao implements CustomerDao {
    List<Customer> customers=new ArrayList<>();


    @Override
    public void add(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Customer customer) {

    }
}
