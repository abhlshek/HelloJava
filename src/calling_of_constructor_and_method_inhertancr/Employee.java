/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calling_of_constructor_and_method_inhertancr;

/**
 *
 * @author sp
 */
public class Employee extends Person {

    String post;
    int salary;

    public Employee(String n, String ad, int ag, String p, int s) {
        super(n, ad, ag);
        post = p;
        salary = s;
    }

    public String toString() {
        return super.toString() + "Post=" + post + ",salary=" + salary;
    }

    public double salaryWithDA() {
        return (115.0 * salary) / 100;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("rahul", "varansi", 34, "teacher", 3000);
        System.out.println(e1);
        System.out.println(e1.salaryWithDA());

    }

}
