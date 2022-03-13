package day11_stringManipulations;

import java.util.Scanner;

public class C03_EqualsIgnorCase {

    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istemedigini sorun evet derse
        //cevabini ve "derse katiliminiz alinmistir" yazdirin
        //hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \nEvet veya Hayir yazin");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katiliminiz onaylanmistir");
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " Sonraki derslerimize bekleriz");
        } else {
            System.out.println("lutfen evet veya hayir yaziniz");
        }
    }
}
