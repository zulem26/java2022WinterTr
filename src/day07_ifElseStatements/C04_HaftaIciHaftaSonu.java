package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //cumartesi veya pazar ise  ==> hafta sonu
        //pazartesi sali carsamba persembe veya cuma ise ==> hafta ici

        //String case sensitive'dir
        //yani pazar, PAZAR, Pazar, PAzar bunlar hep farkli kelimelerdir

        //bu durumda String methodlarindan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();//kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyoruz

        //String ifadelerde == kullanilmasi tavsiye edilmez
        //cunku bekledigimizden farkli sonuc verebilir


        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba")
        || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");
        }





    }
}
