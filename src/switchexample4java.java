/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class switchexample4java {

    public static void main(String[] args) {
        int angle1 = 60, angle2 = 60, angle3 = 60;
        String triangleType;
        switch (angle1 + angle2 + angle3) {
            case 180:
                if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                    triangleType = "Right triangle";
                } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                    triangleType = "Acute triangle";
                } else {
                    triangleType = "Obtuse triangle";
                }
                break;
            default:
                triangleType = "Invalid triangle";
        }
        System.out.println(triangleType);
    }

}
