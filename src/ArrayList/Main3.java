package ArrayList;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
ArrayList<Integer>myNumber=new ArrayList<Integer>();
myNumber.add(33);
myNumber.add(28);
myNumber.add(30);
myNumber.add(99);
myNumber.add(88);

Collections.sort(myNumber);
for(int i:myNumber){
    System.out.println(i);
}
    }

}
