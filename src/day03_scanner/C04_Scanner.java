package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz : ");

        float yaricap = scan.nextFloat();

        System.out.println("girdiginiz yaricap : " + yaricap);
        System.out.println("cemberin cevresi : " + 2*3.14*yaricap);
        System.out.println("dairenin alani : " + 3.14*yaricap*yaricap);




    }
}
