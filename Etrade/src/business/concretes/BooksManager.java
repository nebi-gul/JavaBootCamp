package business.concretes;


import dataaccess.abstracts.BookDao;
import entities.concretes.Books;

import java.awt.print.Book;
import java.util.List;

public class BooksManager {

    private BookDao bookDao;

    public BooksManager(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    public  void add(Books book){
        bookDao.add(book);

    }
    public void delete (Books book){
        bookDao.delete(book);
    }
    public void update(Books book){
        bookDao.update(book);
    }
    public List<Books> getAll(){
        return bookDao.getAll();
    }
}
