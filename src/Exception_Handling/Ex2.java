package Exception_Handling;

import java.util.*;

public class Ex2 {

    public static void main(String[] args) {

        try {
            int n = 10;
            n = n / n;
            int[] a = {};
            a[5] = 10;
        } catch (NullPointerException | ArithmeticException
                | ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);

        } catch (Exception ex) {
            System.out.println("Unknown Exception");
        }
        finally{
            System.out.println("com");}
    }
}
