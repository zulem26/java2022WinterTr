package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //kullanicidan pozitif bir tam sayi alip
        // while loop ile 5 den kucuk pozitif tam sayilari yazdiralim
        int input = 3;
        int sayi =1 ;
        int sayac = 1;

        while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println("sayac :" + sayac);

        //Ayni soru do-while loop ile yapalim



    }
}
