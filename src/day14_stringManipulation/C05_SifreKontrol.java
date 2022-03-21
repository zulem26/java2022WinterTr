package day14_stringManipulation;

public class C05_SifreKontrol {

    public static void main(String[] args) {

        /*Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
         yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

         */

        String sifre = "Aasdf12345a";
        boolean ilkHarf = false;
        boolean sonHarf = false;

        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            ilkHarf = true;
        } else{
            System.out.println("sifrenizin ilk harfi buyuk olmali");
        }


        if (sifre.charAt(sifre.length()-1) >= 'a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf = true;
        } else {
            System.out.println("sifrenizin son harfi kucuk harf olmali");
        }
        boolean bosluk = false;
        if (!sifre.contains(" ")){
            bosluk = true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        boolean uzunluk = false;
        if (sifre.length()>=8){
            uzunluk = true;
        } else {
            System.out.println("sifre en az 8 karakter icermeli");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }






        /*if (sifre.charAt(0)>='A' && sifre.charAt(0)<=('Z')){
            ilkHarf = true;
        } else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");
        }

        boolean sonHarf = false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='a'){
            sonHarf = true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }

        boolean bosluk = false;

        if (!sifre.contains(" ")){
            bosluk = true;
        } else {
            System.out.println("Sifre bosluk icermemeli");
        }

        boolean uzunluk = false;
        if (sifre.length()>=8){
            uzunluk = true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }

        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedilmistir");
        }

         */
    }
}
