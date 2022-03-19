package api;

import business.concretes.BooksManager;
import business.concretes.ComputerManager;

import dataaccess.concretes.JdbcBookDao;
import dataaccess.concretes.JdbcComputerDao;
import entities.concretes.Books;
import entities.concretes.Computer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books books1 = new Books(1, "Tarihin Anıları", 35, 400, "Nebi", "Tarih");
        Books books2 = new Books(2, "Hazine Adası", 50, 300, "Ahmet Topal", "Macere");
        Books books3 = new Books(3, "Hazine Adası", 60, 300, "Engin", "Psikolıji");


        Computer computer1 = new Computer(1, "Dell", "Masaüstü", "i7", 16, 1000);
        Computer computer2 = new Computer(2, "HP", "Laptop", "i5", 8, 2000);
        Computer computer3 = new Computer(3, "Asus", "Laptop", "i5", 8, 100);

        List<Computer> computerList = new ArrayList<Computer>();
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);

        List<Books> booksList = new ArrayList<Books>();
        booksList.add(books1);
        booksList.add(books2);
        booksList.add(books3);
        booksList.remove(books1);


        BooksManager booksManager = new BooksManager(new JdbcBookDao());


        booksManager.add(books1);
        booksManager.add(books2);
        booksManager.add(books3);

        ComputerManager computerManager = new ComputerManager(new JdbcComputerDao());

        computerManager.add(computer1);
        computerManager.add(computer2);
        computerManager.add(computer3);


        computerManager.delete(computer1);


        for (Books book : booksManager.getAll()) {
            System.out.println(book.getId() + " " + book.getName() + " " + "" + book.getAuthor() + " " + "" + book.getUnitPrice() + " " + "" + book.getPage() + " " + book.getType());
        }
        System.out.println("****************************************************************************************");
        for (Computer computer : computerManager.getAll()) {


                System.out.println(computer.getId() + " " + computer.getName() + " " + computer.getProcessor() + " " + computer.getComputerType() + " " + computer.getRam());
            }

        }
    }

