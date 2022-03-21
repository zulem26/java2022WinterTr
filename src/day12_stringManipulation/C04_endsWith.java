package day12_stringManipulation;

public class C04_endsWith {

    public static void main(String[] args) {

        //kullanicidan email adresi girmesini isteyin
        //mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz"
        //@gmail.com ile bitiyorsa "email adresiniz kaydedildi"
        //@gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin

        String email = "zulkifergin@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)){
            System.out.println("email adresiniz kaydedildi");
        } else{
            System.out.println("Lutfen yazimi kontrol edin");
        }
    }
}
