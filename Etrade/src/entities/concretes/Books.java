package entities.concretes;

import entities.abstracts.Product;

public class Books extends Product {
    private int page;
    private String author;
    private String type;

    public Books() {
    }

    public Books(int id ,String name ,double unitPrice ,int page, String author, String type) {
        super(id,name,unitPrice);
        this.page = page;
        this.author = author;
        this.type = type;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
