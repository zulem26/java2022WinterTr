package day13_stringManipulation;

public class C01_substring {

    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5));

        System.out.println(str.replace("Java", "Mehmet hoca"));
        System.out.println("Mehmet hoca " + str.substring(5));

        System.out.println(str.substring(9)); //yazilan index inclusive

        //eger bir index den sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir str.substring(basalangicIndex, bitisIndex)
        //baslangic index ==> inclusive/dahil
        //bitis index ==> exclusive/haric

        System.out.println(str.substring(0,5)); //Java
        System.out.println(str.substring(0,1)); //J
        String harf=str.substring(5,6); // bana i verecek 6. karakteri String olarak verecek
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7,7)); //hiclik dondurur
        //System.out.println(str.substring(5,2)); //bitis index i baslangic indexinden kucuk olamaz

    }
}
