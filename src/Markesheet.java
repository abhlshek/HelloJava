/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class Markesheet {

    String name;
    int rollno, physic, chemistry, math;

    public Markesheet(String name, int rollno, int physic, int chemistry, int math) {
        this.name = name;
        this.rollno = rollno;
        this.physic = physic;
        this.chemistry = chemistry;
        this.math = math;

    }

    public String toString() {
        return "Markesheet {" + "name=" + name + ",rollno=" + rollno + ",physic=" + physic + ",chemistry=" + chemistry + ",math=" + math + '}';
    }

    public String result() {
        if (math < 40) {
            return "Fail";
        }

        if (physic < 40) {
            return "Fail";
        }

        if (chemistry < 40) {
            return "Fail";
        }
        return "Pass";
    }

    public static void main(String[] args) {
        Markesheet marks = new Markesheet("rohin", 11, 30, 50, 60);
        System.out.println(marks.result());

    }

}
