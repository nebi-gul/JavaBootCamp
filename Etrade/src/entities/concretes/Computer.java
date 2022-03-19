package entities.concretes;

import entities.abstracts.Product;

public class Computer extends Product {
    private String computerType;
    private String processor;
    private int ram;


    public Computer() {

        super();
    }

    public Computer(int id, String name,String  computerType, String processor, int ram,double unitPrice) {
       super(id,name,unitPrice);
        this.computerType = computerType;
        this.processor = processor;
        this.ram = ram;
    }

    public String getComputerType() {

        return computerType;
    }

    public void setComputerType(String computerType) {

        this.computerType = computerType;
    }

    public String getProcessor() {

        return processor;
    }

    public void setProcessor(String processor) {

        this.processor = processor;
    }

    public int getRam() {

        return ram;
    }

    public void setRam(int ram) {

        this.ram = ram;
    }
}


