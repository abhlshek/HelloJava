/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambda;

/**
 *
 * @author sp
 */
import java.util.Scanner;

public class MobileSearch {

    static void search(Mobile[] mobiles, SearchInterface si) {
        System.out.println("\n Search Results");
        for (Mobile mobile : mobiles) {
            if (si.isSelected(mobile)) {
                System.out.println("mobile");

            }
        }
        
    }
    static Mobile[] mobiles = {new Mobile("MX1", "Mamsung", 1000), new Mobile("EP3", "Epromax", 2000), new Mobile("Yeskia10", "Yeski", 2500), new Mobile("MX4", "Mamsung", 1500)};

    public static void main(String[] args) {
        SearchInterface si = b -> b.getManufacture().trim().toLowerCase().equals("mamsung");
        System.out.println("\nMamsung Mobiles");
        search(mobiles, si);
        si = b -> b.getPrice() >= 2000 && b.getPrice() <= 3000;
        System.out.println("\nMobiles from 2000 to 3000");
        search(mobiles, si);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower range and upper range");
        int lower = s.nextInt();
        int upper = s.nextInt();
        si = b -> b.getPrice() >= lower && b.getPrice() <= upper;
       System.out.printf("\nMobiles from %s to %s\n", lower, upper);
        search(mobiles, si);
    }
}


