package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleri {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanici gun ismini yanlis girerse "yanlis giris" yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //cumartesi veya pazar ise  ==> hafta sonu
        //pazartesi sali carsamba persembe veya cuma ise ==> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini girin");
        String gunIsmi = scan.next().toLowerCase();


        //hatali girisleri de yazdirmak icin
        //olasiliklari 3 e cikardim
        //hafta sonu - hafta ici - yanlis giris

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun hafta sonu");
        }else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba")
                || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");
        }else{
            System.out.println("yanlis girdiniz");
        }

        // eger if else if ...... statement else ile bitiyorsa olasiliklardan sadece
        //bir tanesi mutlaka calisir
        //Java ilk buldugu true a ait sonucu yazdirir
        //ve kalan sartlara bakmaz

        //if else if ... cumleleri else ile bitmese de calisir
        //ancak bu durumda sadece bir olasilik calisabilir veya hic bir islem yapilmayabilir

    }
}
