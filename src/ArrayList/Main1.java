//Create an ArrayList to store numbers (add elements of type Integer):

package ArrayList;

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer>number =new ArrayList<Integer>();
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        for(int i:number){
            System.out.println(i);
        }
        
    }
    
}
