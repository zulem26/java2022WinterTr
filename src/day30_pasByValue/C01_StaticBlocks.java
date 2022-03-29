package day30_pasByValue;

import day29_staticKeyword.C01_Static;

public class C01_StaticBlocks {
    static{
        System.out.println("static block1 calisti");
        /*
            static block class ilk calismaya basladiginda devreye girer ve class in calismasi
            icin gerekli on hazirliklar icin kullanilir yazildigi satirin hic bir onemi yoktur,
            class icerisinde istenen yerde yazilabilir.

            Static block birden fazla olursa, blocklar yukaridan asagiya dogru sirayla calisir
         */
    }
    static{
        System.out.println("static block2 calisti");
    }

    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }
    public static void main(String[] args) {
        System.out.println("main method baslangici");

        C01_StaticBlocks obj1;
        new C01_StaticBlocks();


    }
}
