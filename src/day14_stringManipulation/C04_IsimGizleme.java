package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        /*Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi
        yazdirin
        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234 */

        String isim = "zulkif";
        String soyisim = "ERGIN";
        String kKNo = "1234567890123456";

        String yeniIsim = isim.substring(0,1).toUpperCase() +
                          isim.substring(1).replaceAll("\\S", "*");

        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                           soyisim.substring(1).replaceAll("\\S", "*");

        String yeniKKNo= "**** **** **** " + kKNo.substring(12);

        System.out.println("isim-soyisim : " + yeniIsim+" " + yeniSoyisim+"\nkart no : " + yeniKKNo);


    }
}
