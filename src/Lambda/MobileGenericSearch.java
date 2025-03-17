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
import java.util.*;
public class MobileGenericSearch<T> {

    void search(T[] ts, GenericSearchInterface si) {
        System.out.println("\nSearch Results");
        for (T t : ts) {
            if (si.isSelected(t)) {
                System.out.println(t);
            }
        }
    }
    static Mobile[] mobiles = {new Mobile("MX1", "Mamsung", 1000), new Mobile(
        "EP3", "Epromax", 2000), new Mobile("Yeskia10", "Yeski", 2500), new Mobile("MX4", "Mamsung",
        1500)};

    public static void main(String[] args) {
        GenericSearchInterface<Mobile> si = b -> b.getManufacture().trim().toLowerCase().equals("mamsung");
        MobileGenericSearch<Mobile> mgs1 = new MobileGenericSearch<>();
        System.out.println("\nMamsung Mobiles");
        mgs1.search(mobiles, si);
        si = b -> b.getPrice() >= 2000 && b.getPrice() <= 3000;
        System.out.println("\nMobiles from 2000 to 3000");
        mgs1.search(mobiles, si);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower range and upper range");
        int lower = s.nextInt();
        int upper = s.nextInt();
        si = b -> b.getPrice() >= lower && b.getPrice() <= upper;
        System.out.printf("\nMobiles from %s to %s\n", lower, upper);
        mgs1.search(mobiles, si);
        MobileGenericSearch<String> mgs2 = new MobileGenericSearch<>();
        String[] strings = {"Apple", "Ball", "Cat", "Dog", "Elephant"};
        GenericSearchInterface<String> gsi = b -> b.toLowerCase().trim().contains("e");
        System.out.printf("\nWords containing e\n", lower, upper);
        mgs2.search(strings, gsi);

    }
}
