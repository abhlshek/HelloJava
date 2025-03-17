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

public class Arrays2Dexample1java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] number = new int[row][cols];

        //input
        //row control
        for (int i = 0; i < row; i++) {
            //colums
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }

        }
        //output

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }

}
