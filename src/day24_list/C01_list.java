package day24_list;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_list {

    public static void main(String[] args) {
        int arr[] = {};
        //bu array e 5 ekeleyelim

        arr= C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr)); //5

        //bir de 3 ekleyelim

        arr= C06_Arrays.arrayeElemanEkle(arr, 3);
        System.out.println(Arrays.toString(arr));

        //bir list olusturalim
        List<Integer> sayilarList=new ArrayList<>();
        System.out.println(sayilarList); //[ ]

        sayilarList.add(5); //[5]
        sayilarList.add(3); //[5, 3]
        sayilarList.add(0, 7); //[7, 5, 3]   index 0 a 7 eklendi
        sayilarList.add(2, 7); //[7, 5, 7, 3]     index 2 ye 7 eklendi
        System.out.println(sayilarList); //[7, 5, 7, 3]
    }
}
