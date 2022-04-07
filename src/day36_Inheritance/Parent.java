package day36_Inheritance;

public class Parent {
    protected Parent(){
        System.out.println("Parent parametresiz constructor calisti");
    }

    protected Parent(int sayi3, int sayi4){
        System.out.println("Parent 2 parametreli constructor");
    }
    protected int sayi;

}
