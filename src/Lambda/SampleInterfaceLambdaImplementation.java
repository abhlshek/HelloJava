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
public class SampleInterfaceLambdaImplementation {

    public static void main(String[] args) {
        SampleInterface st = () -> {
            System.out.println("Method implemented using Lambda Expression");
        };
        st.sampleMethod();
    }

}
