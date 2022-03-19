package dataaccess.abstracts;

import entities.concretes.Computer;

import java.util.List;

public interface ComputerDao {
    void add(Computer computer);
    void delete(Computer computer);
    void update(Computer computer);
    List<Computer> getAll();
}
