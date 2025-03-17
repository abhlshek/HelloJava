//Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
package ArrayList;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("ford");
        cars.add("Mazda");
        Collections.sort(cars);  //sort cars
        
        
        cars.remove(0);          //remove cars
        System.out.println(cars);
        
        cars.set(1,"volvo");  // set method and refer to the index number:
        System.out.println(cars);
        
        cars.clear();                 //all element delete
        System.out.println(cars);


        

        


        for (String i : cars) {
            System.out.println(i);
        }
    }

}
