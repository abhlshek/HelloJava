package inheritance;

import abstractclassesandinterfaces.PNB;
import abstractclassesandinterfaces.SBI;

public abstract class AbstractAccount {
    public abstract void deposit();
    public  void Display(){
        System.out.println("AbstractAccount is display");
    }
/*
    A
    B extends A
    
    A x1=new A()
    A x2=new B()
    B x3=new A()
    B x1=new B()
    
    
    
    
    */
    public static void main(String[] args) {
      // AbstractAccount a1=new AbstractAccount();
        //a1.deposit();
        AbstractAccount a2=new SBI();
        //SBI a3=new AbstractAccount();
        SBI a4=new SBI();
        
        AbstractAccount a5=new PNB();
        PNB a6=new PNB();
        
        //a1.Display();
        a2.Display();
        a4.Display();
        a5.Display();
        a6.Display();

    }

}
