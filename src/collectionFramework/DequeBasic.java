/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author sp
 */
public class DequeBasic {

    public static void main(Stringjava[] args) {
        //Queue<Integer>w=new Queue<>();
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.addFirst(0);
        System.out.println(q);
        
    //remove();
    //removeLast();
    //removeFirst();
    
        q.remove();
        q.removeLast();
        q.removeFirst();
        System.out.println(q);
        
        
        System.out.println(q.getFirst());
        
    //

    }

}
