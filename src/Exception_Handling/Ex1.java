package Exception_Handling;

import java.util.*;

public class Ex1 {

    public static void main(String[] args) {
        try {
            int n = 10;
            n = n / n;
            int[] a = {};

            a[5] = 10;
        } catch (NullPointerException ex) {
            System.out.println("Found a null value");

        } 
        catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception");

        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Index Out of Bounds Exception");

        } 
        catch (Exception ex) {
            System.out.println("Unknown Exception");

        }
        System.out.println("Thanks for using");

    }

}

