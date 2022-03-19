package dataaccess.concretes;

import business.concretes.BooksManager;
import dataaccess.abstracts.BookDao;
import entities.concretes.Books;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class JdbcBookDao implements BookDao {
    List<Books> books ;

    public JdbcBookDao() {
         books=new ArrayList<Books>();
    }

    @Override
    public void add(Books book) {
        books.add(book);
        System.out.println("Jdbc ile eklendi "+ book.getName());
    }

    @Override
    public void delete(Books book) {
        books.remove(book);
        System.out.println("Jdbc ile silindi "+ book.getName());
    }

    @Override
    public void update(Books book) {
        System.out.println("Jdbc ile  Güncellendi. "+book.getName());
    }

    @Override
    public List<Books> getAll() {
        return books;
    }

}
