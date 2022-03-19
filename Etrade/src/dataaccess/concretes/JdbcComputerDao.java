package dataaccess.concretes;

import dataaccess.abstracts.ComputerDao;
import entities.concretes.Computer;

import java.util.ArrayList;
import java.util.List;

public class JdbcComputerDao implements ComputerDao {
    List<Computer> computers;

    public JdbcComputerDao() {
        computers=new ArrayList<Computer>();
    }

    @Override
    public void add(Computer computer) {
        computers.add(computer);
        System.out.println("Jdbc ile eklendi" + computer.getName());
    }

    @Override
    public void delete(Computer computer) {
        computers.remove(computer);

    }

    @Override
    public void update(Computer computer) {
        System.out.println("Jdbc ile eklendi "+computer.getName());
    }

    @Override
    public List<Computer> getAll() {
        return computers;
    }
}
