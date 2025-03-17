
package HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String>cars=new HashSet<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.contains("Mazda");
        cars.remove("volvo");
       // cars.clear();
        cars.size();
        System.out.println(cars);
        for(String i:cars){
            System.out.println(i);
        }
    }
    
}
