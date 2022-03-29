package day21_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_ArraysCalisma {
    public static void main(String[] args) {


       String [] arr = {"tavsan", "serce"};

       List<String> list = Arrays.asList(arr);

        System.out.println(list.size());//2
        System.out.println(list);

        list.set(1, "test");
        arr[0] = "new";
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        //Eger array deki bir elemani degistirirseniz list teki eleman da otomatik olarak
        //degisir. Listteki bir elemani degistirirseniz array de otomatik olarak degisir

        List<String> list1 = new ArrayList<>();
        list1.add("tavsan");
        list1.add("horoz");
        System.out.println(list1);

        String arr1[] = list1.toArray(new String[0]);
        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1));

        Object arr2[] = list1.toArray();
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr2));

        int arr3[] = {12,13,14,44};

        for (int i :arr3){
            System.out.print(i+" ");
        }
        System.out.println("");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Ali");
        list3.add("Veli");
        list3.add("Can");


        for (String s:list3){
            System.out.print(s + " ");
        }


        int arr5 [] = {2,4,3,5,6,8};
        System.out.println("");
        for (int i:arr5){
            System.out.println(i+ " ");
        }

    }
}
