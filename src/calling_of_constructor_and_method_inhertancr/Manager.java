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
public class Manager extends Employee {

    String department;
    Employee secretary;

    public Manager(String name, String address, int age, int salary, Employee sec, String d) {
        super(name, address, age, "Manager", salary);
        secretary = sec;
        department = d;
    }

    public String toString() {
        return super.toString() + ", Department = " + department + ", Secretary = " + secretary;
    }

    public double salaryWithDA() {
        return (115.0 * salary) / 100;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Popat", "Mumbai", 40, "Secretary", 1000);
        Manager m1 = new Manager("Mirajkar", "Miraj", 45, 2000, e1, "Computers");
        System.out.println(e1);

        System.out.println(m1);
        System.out.println(e1.salaryWithDA());
        System.out.println(m1.salaryWithDA());

    }

}
