package Exception_Handling;

import java.util.*;

public class NewClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b. I'll give you a/b");
        int a = s.nextInt();
        int b = s.nextInt();
        try {
            int result = a / b;
            System.out.println(result);

        }
        catch (Exception ex){
             System.out.println(ex);

            
        
         


    }
    
     System.out.println("Thanks for using");


}
}
