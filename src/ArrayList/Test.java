/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>(); //Creating arraylist
        
        //Adding Object in arraylist
        
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        
        //Traversing list through Iterator
        
        Iterator itr=list.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
        
    }
    }
    
}
