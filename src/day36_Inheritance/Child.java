package day36_Inheritance;

public class Child extends Parent{
    Child(){
        super ();
        System.out.println("Child constructor calisti");
    }

    // Tum class larda biz gormesek bile Java nin olusturdugu default constructor vardir
    // Extends keyword kullanan Tum CONSTRUCTOR larin ilk satirinda biz gormesek bile
    // super() constructor call vardir
    // Yani parent class in parametresiz constructor call

    public static void main(String[] args) {
        Child child = new Child();
    }
}
