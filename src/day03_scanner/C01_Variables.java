package day03_scanner;

public class C01_Variables {
    public static void main (String [] args){

        //Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String okulIsmi = "Yildiz Koleji";
        System.out.println(okulIsmi); //Yildiz Koleji

        char ilkHarf;
        ilkHarf = 'K';  //K
        System.out.println(ilkHarf);

        int sayi1 = 10, sayi2 = 20;
        System.out.println(sayi1 + sayi2); //30

        //isim ve soyisim icin iki variable olusturun ve bunlari
        //isminiz : Zulkif
        //soyisminiz : Ergin
        //seklinde yazdirin
        String isim = "Zulkif";
        String soyIsim = "Ergin";
        System.out.println("isminiz : " + isim);
        System.out.println("soyisminiz : " + soyIsim);

        // iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3 = 20;
        double sayi4 = 30;
        System.out.println("iki sayinin toplami : " + (sayi3+sayi4));
//6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf); // 117
        // char data turundeki degiskenler matematetiksel islemlerde kullanilirsa
        // o char degerinin ASCII karsiligi ileme alinir
        int sayi6='a';
        System.out.println(sayi6); // 97




    }
}
