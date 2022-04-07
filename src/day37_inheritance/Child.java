package day37_inheritance;

import day36_Inheritance.Parent;

public class Child extends Parent {
    // bir class i child class yaptigimizda parent class daki constructor a ulasmasi gerekir
    // bu durumda parent class daki constructor in access modifier i uygun bir modifier yapilmalidir

    Child(){
        super();
        System.out.println("child class parametresiz constructor");
    }
    Child(int s){
        // Child class da tum constructor larin ilk satirina
        // Java nin yerlestirdigi constructor PARAMETRESIZ dir yani super
        System.out.println("child class parametreli constructor");
    }
    Child (int sayi1, int sayi2){
        //Eger parent class dan parametresiz constructor i degil de baska bir constructor i
        //calistirmak isterseniz bunu child class daki constructor in ILK SATIRINA yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("Child iki parametreli constructor");
    }
    public static void main(String[] args) {

        Child child = new Child(5);
    }
}
