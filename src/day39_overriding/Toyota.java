package day39_overriding;

public class Toyota extends Araba{

    String hiz = "Toyota araclar maksimum 220 km hiz yaparlar";
    String marka = "Toyota";
    String sirketMerkezi = "Japonya";


    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit durumuna gore yakit tuketirler");
    }
    public void garanti(){
        System.out.println("Toyota araclar 10 yil garantilidir");
    }
}
