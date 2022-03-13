package day10_switch_StringManipulation;

public class C04_charAt {
    public static void main(String[] args) {
        //String de her hangi bir karakteri almak istedigimizde
        // o harfin index ini kullanarak
        // str.charAt(istenenIndex) yazabiliriz


        String str = "Java Cok Guzel";
        // j yi yazdirabiliriz
        System.out.println(str.charAt(0));
        // G yi yazdiralim
        System.out.println(str.charAt(9));

        //va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3));
        //bu sekilde yazarsak ascii karakterini alir ve matematik islem cikar
        //bunu onlemek icin onune veya arkasina "" koyamliyiz

        //cOK seklinde yazdiralim
        System.out.println(str.toLowerCase().charAt(5) +
                "" + str.toUpperCase().charAt(6) +
                str.toUpperCase().charAt(7));

        //son karakeri yazdir
        //String de 14 harf var, son harfin indexi 14-1
        // cunku index 0 dan basladigi icin -1 yapip son karakteri buluyoruz

        System.out.println(str.charAt(14-1)); //uzunluk -1




    }
}
