/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
import java.util.*;
public class Arraysexample1java {
    public static void main(String[] args) {
        //int[] marks = new int[3];  // method1 syntex
        int marks[]=new int[3];      // method 2 syntex
        marks[0] = 97; //phy
        marks[1] = 98; //chem
        marks[2]=95; // eng
        //System.out.println(marks);//garbase value
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
       // System.out.println(marks[2]);
       
       
       for(int i=0;i<3;i++){
           System.out.println(marks[i]);
       }


    }
    
    
}
