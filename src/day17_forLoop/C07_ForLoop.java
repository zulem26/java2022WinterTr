package day17_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {
        //Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
        // 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        //Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.

        int sayi = 48;

        for (int i = 1; i <= 48 ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print(" ");
                System.out.print("Java Guzeldir ");
            } else if (i%5==0){
                System.out.print("Guzeldir ");
            } else if (i%3==0){
                System.out.print("Java ");
            } else{
                System.out.print(i + " ");
            }
        }

    }
}
