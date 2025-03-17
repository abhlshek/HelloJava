/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oops;

/**
 *
 * @author sp
 */
public class Result {

    int rollno, physics, chemistry, maths;
    String name;

    public Result(int r, int p, int c, int m, String n) {
        this.rollno = r;
        this.physics = p;
        this.chemistry = c;
        this.maths = m;
        this.name = n;
    }

    @Override
    public String toString() {
        if (physics < 40 || maths < 40 || chemistry < 40) {
            return String.format("Name=%s, Roll No=%s, Physics=%s, Chemistry=%s, Maths=%s, Result=%s", name, rollno, physics, chemistry, maths, "fail");
        }
        else{
            return String.format("Name=%s, Roll No=%s, Physics=%s, Chemistry=%s, Maths=%s, Result=%s",name,rollno,physics,chemistry,maths, "pass");

            
        }

    }

    public static void main(String[] args) {
        Result R1=new Result(101,45,75,49,"pappu");
        System.out.println(R1);

    }

}
