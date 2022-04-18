package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static{
    /*
        Bir interface de default veya static olarak tanimlanan ve body si olan method larin override
        edilmesi mecburi DEGILDIR

        Eger static olarak tanimlanmissa zaten override edemeyiz
     */
    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        //Interface de static olarak tanimlanan methodlara static yontemlerle ulasilabilir
        //InterfaceIsmi.methodIsmi
        I01_Default_Static.method3();

        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method1(); // child class
        obj.method1(); // parent Interface
        // obj.method3(); eski class larda static bir uyeye static olmayan yollarla da ulasabilirdik
        // Ancak interface icerisinde static olarak tanimlanan method a static olmayan yontemlerle
        // ulasilamaz
    }
}
