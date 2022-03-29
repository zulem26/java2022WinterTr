package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {

        //kullanicidan email adresi girmesini isteyin
        //mail @gmail.com icermiyorsa "lutfen gmail adresi giriniz"
        //@gmail.com ile bitiyorsa "email adresiniz kaydedildi"
        //@gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin" yazdirin

        String email = "zulkifergin@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf(arananMetin)==(email.length()-10)){
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lutfen yazimi kontrol edin");
        }

    }
}
