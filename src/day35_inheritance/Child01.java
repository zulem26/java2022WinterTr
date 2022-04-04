package day35_inheritance;

import static day35_inheritance.Parent.*;
import static org.graalvm.compiler.hotspot.nodes.type.MethodPointerStamp.method;

public class Child01 {
    public static void main(String[] args) {
        /*
            Child class hicbir objeye ihtiyaca duymadan parent class taki variable ve methodlara
            ulasabilir

         */

        System.out.println(isim);  //Neval
        System.out.println(fabrika);  //Yildiz Tekstil

        method1();
        method2();

        Parent objParent = new Parent();

    }
}
