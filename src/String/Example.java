/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author sp
 */
public class Example {

    public static void main(String[] args) {
        //length
        String a = "rohan";
        System.out.println(a.length());
        //charAt(int)
        String name = "rohan";
        System.out.println(name.charAt(4));

        //indexof(char)
        String b = "neeraj";
        System.out.println(b.indexOf('e'));

        //last index of(char)
        String c = "Anaaya";
        System.out.println(c.lastIndexOf('a'));
        //campareto()
        String Name = "tony";
        String Last = "tony";
        System.out.println(Name.compareTo(Last));

        //campareto
        if (Name.compareTo(Last) == 0) {
            System.out.println("String are equal");

        } else {
            System.out.println("String are not equal");
        }
        
        //startwith()  output->true,false
        String d="program";
        String e="pro";
        System.out.println(d.startsWith(e));
        
        //endwith()
        String f="village";
        String g="lages";
        System.out.println(f.endsWith(g));
        
        //substring(int start)
        //substring(int start,int end)
        String h="java program";
        System.out.println(h.substring(4));
        System.out.println(h.substring(0, 4));
        
        //replace(char old,char new)
        String i="string are toString";
        System.out.println(i.replace("string", "toString"));
        
        //tolowercase()
        //toUppercase()
        String j="rohan";
        System.out.println(j.toLowerCase());
        System.out.println(j.toUpperCase());
        
        //trim()
        String k="   sohan is good";
        System.out.println(k.trim());

        
        

    }

}
