/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList < String > ();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        // ArrayList with a for loop, and use the size() method 
        
        for(int i=0; i<cars.size();i++){
            System.out.println(cars.get(i));
            
        }
       
       //You can also loop through an ArrayList with the for-each loop:

       
        for(String i:cars){
            System.out.println(i);
        }
        
        

    }

}
