import java.util.*;

public class functionexample6java {
    public static String printVote(int age) {
        if (age > 18) {
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("For vote: " + printVote(age));
       // sc.close();
    }
}
