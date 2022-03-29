package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini yazdirin

        int input = 20;
        //for loop ile yapabiliriz ama biz
        //while loop ile yapalim

        int bolen = 1;
        int sayac = 0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.println(bolen + " ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + " sayisini bolen " + sayac + "adet sayi vardir");

    }
}
