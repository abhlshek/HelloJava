/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author sp
 */
public class hello {
    int n;
    String message;
    public static void hello(int n,String message){
        for(int i=1; i<=n;i++){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        
        hello(5,"hello");
        
        
    }
        

    
}
