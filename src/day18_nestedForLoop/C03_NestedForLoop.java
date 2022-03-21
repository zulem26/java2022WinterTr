package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*kullanicidan pozitif vir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizin

        *
        * *
        * * *
        * * * *

        */
        int input = 5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                //nested for loop ya dikdortgen veya ucgen formatinda olabilir
                //dikdortgen istedigimizde iki loop icin de bagimsiz end point belirleriz
                //ucgen sekli vermek icin inner loop un end point ini olarak outer degiskene baglariz

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
