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
public class Mobile {

    private String model, manufacturer;
    private int price;

    public Mobile(String model, String manufacturer, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;

    }
    public String getManufacture(){
        return manufacturer;
    }
    public int getPrice(){
        return price;
    }
    @Override

    public String toString() {
        return "Mobile{" + "model=" + model + ", manufacturer=" + manufacturer + ", price=" + price + '}';
    }
    public static void main(String[] args) {
        Mobile m=new Mobile("nokia","India",12000);
        System.out.println(m);
        System.out.println(m.price);
        System.out.println(m.manufacturer);
        
    }

}
