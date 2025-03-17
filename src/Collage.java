/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Collage {

    String Name, Subject;
    int rollno;

    //public Collage(String Name,int rollno ){
    // this.Name=Name;
    // this.rollno=rollno;
    // this.Subject="java";
    // System.out.println("two");
    // }
    
    // class ke contrucrer ko call karne ke liye
    
    public Collage(String Name, int rollno) {
        this(Name, "Java", rollno);
        System.out.println("two");
    }

    public Collage(String Name, String Subject, int rollno) {
        this.Name = Name;
        //System.out.println(this);
        this.Subject = Subject;
        this.rollno = rollno;
        System.out.println("three");
    }

    public String toString() {
        String name;
        return "Collage{" + "Name=" + Name + ", Subject=" + Subject + ", rollno=" + rollno + "}";

    }

    public static void main(String[] args) {
        Collage C = new Collage("rohan", "computer", 101);
        System.out.println(C);
        Collage c1 = new Collage("rahul", 11);
        System.out.println(c1);

    }

}
