package day42_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu = "src/day41_exceptions/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k=0;
            while((k=fis.read()) != -1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
            Alti kirmizi cizgili her kod CTE degildir
            Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer biz
            bu gune kadar tamamina CTE diyorduk ancak exception konusu ile birlikte
            Compile Time Exception kavrami da hayatimiza girdi
            */

        /*
            Exception lar icin de parent childe iliskisi mevcuttur Eger bir kod icin birden
            fazla exception olusma ihtimali varsa Oncelikle olasi exceptionlar parent-child
            iliskisi tasiyor mu bakmamiz gerekir
            Eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz

            Eger parent child iliskisi varsa sadece parent exception i yazabiliriz veya iliskisini
            de yazmak istersek
         */
    }
}
