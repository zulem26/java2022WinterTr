package day30_pasByValue;

public class C02_StaticBloks {
    {
        /*
            static olmayan bloklar ise obje olusturulurken calisir

            static blcoklar sadece 1 kere en basta calisir ama static olmayan blocklar
            her obje olusturulurken yeniden calisir

         */
        System.out.println("static olmayan block calisti");
    }

    static{
        System.out.println("static block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBloks obj1 = new C02_StaticBloks();
        C02_StaticBloks obj2 = new C02_StaticBloks();



    }
}
