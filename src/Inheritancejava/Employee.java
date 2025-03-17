/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritancejava;

/**
 *
 * @author sp
 */
public class Employee extends Person{
    String post;
    int salary;
    public Employee(String n,String ad,int ag,String p,int s){
        super(n,ad,ag);
        post=p;
        salary=s;
    }
    public String toString(){
        return super.toString()+ "post="+post+ ",salary"+salary;
    }
    public static void main(String[] args) {
       // Person P1=new Person("vinayak","varanasi",54);
        //System.out.println(P1);
        Employee e1=new Employee("deepika","varansi",44,"software en",1000);
        System.out.println(e1);
        
    }
    
}
