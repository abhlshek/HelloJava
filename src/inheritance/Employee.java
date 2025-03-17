package inheritance;

//the sub class--Employee
public class Employee extends Person {

    String post;
    int salary;

    public Employee(String n, String ad, int ag, String p, int s) {
        super(n, ad, ag);
        post = p;
        salary = s;
    }

    public double salaryWithDA() {
        return (110.0 * salary) / 100;

    }

    public String toString() {
        return super.toString() + ", Post = " + post + ", Salary = " + salary;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rohan", "Varanasi", 10);
        Employee e1 = new Employee("Rahul", "Ghazipur", 23, "Software Engineer", 10000);
        System.out.println(p1);
        System.out.println(e1);

    }
}
