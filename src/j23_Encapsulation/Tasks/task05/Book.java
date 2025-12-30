package j23_Encapsulation.Tasks.task05;

import java.util.Scanner;

public class Book {//outher Class level
    //fields...
private  String bookName;
private String authorName;
    //constructor...

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }


    //getter setter...

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
//toString...


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}//outher class sonu

class BookRunner {//inner Class level

    public static void main(String[] args) {

Book bk=new Book("Avusturaylya Dinleri", "Eliade");
        System.out.println("bk = " + bk);
    }
}//inner class sonu
































