package business.concretes;

import dataaccess.abstracts.ComputerDao;


import entities.concretes.Computer;

import java.util.List;

public class ComputerManager {

    private ComputerDao computerDao;

    public ComputerManager(ComputerDao computerDao){
        this.computerDao=computerDao;
    }
    public void add(Computer computer){
        computerDao.add(computer);
    }
    public void delete(Computer computer){
        computerDao.delete(computer);
    }
    public void update(Computer computer){
        computerDao.update(computer);

    }
    public  List<Computer> getAll(){
        return computerDao.getAll();
    }
}
