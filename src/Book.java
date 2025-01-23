/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Book {

    String bookname, subject;
    int price;

    public Book(String b, String s, int p) {
        bookname = b;
        subject = s;
        price = p;
    }
// display method..........
    public void display() {
      System.out.printf("Book Name=%s,Subject=%s,Price=%s\n", bookname, subject, price);

   }
    public static void main(String[] args) {
        Book b1 = new Book("Basic C", "C", 150);
        Book b2 = new Book("adv java", "java", 350);
         b1.display();
         b2.display();
        System.out.println(b1);
        System.out.println(b2);
        int n=12;
        System.out.println(n);

    }
    //tostring method...

    public String toString() {
        return String.format("Book Name=%s,Subject =  %s,Price =  %s",bookname,subject,price);
        
    }

}
