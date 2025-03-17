/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

/**
 *
 * @author sp
 */
import java.util.ArrayDeque;
import java.util.Queue;

public class QuabeDemo {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.forEach(s -> {
            System.out.println(s);
        });

    }

}
