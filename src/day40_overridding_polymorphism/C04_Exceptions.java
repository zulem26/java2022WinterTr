package day40_overridding_polymorphism;

public class C04_Exceptions {
    public static void main(String[] args) {

        //String olarak verilen bir sayiyi, integer a cevirip
        //2 katini ekranda yazdiralim

        String str = "12345";

        // str icinde sayi olmayan bir karakter olursa
        //NumberFormatException.forInputString verir



        try {
            int sayi = Integer.parseInt(str);
            System.out.println("girilen sayinin 2 kaati : " + 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("girdiginiz string sayi olmayan elementler iceriyor");
        }
    }
}
