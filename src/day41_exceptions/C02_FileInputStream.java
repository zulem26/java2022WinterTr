package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            Bir kod yazilirken olasi exception lar ongorulup excepiton olustugunda Java nin
            ne yapmasini istedigimiz belirtilmelidir.

            1- Eger exception olustugunda kodun calismaya devam etmsini istemiyorsak
            method isminin yanina olusabilecek exception i deklare edebiliriz
            2- Eger exception olussa da kodun calismaya devam etmesini istiyorsak sorun
            olusturabilecek kodu try catch blogunun icine alir try bloguna sorun cikabilecek
            kodu catch bloguna
         */
        String dosyaYolu = "src/day41_exceptions/dosya";

        FileInputStream fis = new FileInputStream(dosyaYolu);
    }
}
