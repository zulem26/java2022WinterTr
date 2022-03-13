package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {



    String cumle = "Java ogren,yeni program ile yeni bir sayfa ac";
    String kelime = "yeni";

    int ilkKullanim = cumle.indexOf(kelime); // -1 veya index
    int sonKullanim = cumle.lastIndexOf(kelime);

    if (ilkKullanim==(-1)){
        System.out.println("girilen kelime cumlede kullanilmamis");
    } else if (ilkKullanim==sonKullanim){
        System.out.println("girilen kelime cumlede 1 kere kullanilmis");
    } else {
        System.out.println("girilen kelime cumlede 1 den fazla kullanilmis");
    }

    String str = "Eclipse";
        System.out.println(str.lastIndexOf("p", 4));  //4

    }
}
