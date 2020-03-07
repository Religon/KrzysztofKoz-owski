package pl.sda.przed_zajęcia9.Athor_and_the_Book_Class;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = new Author[10];
        this.price = price;
        qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = new Author[10];
        this.price = price;
        this.qty = qty;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + getAthorNames() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAthorNames(){
        String tab = null;
        for(int i = 0; i < authors.length; i++){
            if(authors[i].getName() != null)
                tab += authors[i].getName();
        }

        return tab;
    }


    ///settery i gettery
    public void setName(String name){
        this.name = name;
    }

    public void setAuthors(Author[] authors){
        this.authors = authors;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setQty(int Qty){
        this.qty = qty;
    }

    public int getQty(){
        return qty;
    }
}
