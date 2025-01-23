/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class pattern5java {
    public static void main(String[] args) {
      int n=5;
      //outter loop
      for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){      //j<=i -> j<n-1
              System.out.print(j+" ");
          }
          System.out.println();
      }
    }
    
}
