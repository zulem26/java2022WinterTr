package day34_accessModifier_encapsulation;

public class C03 {
    //encapsule edecegimiz 2 variable olusturalim

    private int sayi;
    private String str;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str=" + str ;
    }

    public void setStr(String str) {
        this.str = str;


    }
}
