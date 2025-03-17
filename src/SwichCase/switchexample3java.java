/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class switchexample3java {
    public static void main(String[] args) {
        char grade = 'B';
String message;
switch (grade) {
  case 'A':
    message = "Excellent!";
    break;
  case 'B':
    message = "Good!";
    break;
  case 'C':
    message = "Fair!";
    break;
  case 'D':
    message = "Poor!";
    break;
  default:
    message = "Invalid grade";
}
System.out.println(message);
        
        
        
    }
    
}
