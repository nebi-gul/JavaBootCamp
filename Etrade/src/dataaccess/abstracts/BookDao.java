package dataaccess.abstracts;

import entities.concretes.Books;

import java.awt.print.Book;
import java.util.List;

public interface BookDao {
    void add(Books book);

    void delete(Books book);

    void update(Books book);

    List<Books> getAll();


}
