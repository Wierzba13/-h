package arrays_loops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*
    1. deklaracja tablicy

        * Deklaracja tablicy przechowujacych int o dlugosci 10 (indexy 0-9)
            int[] arr = new int[10];
        * W miejsca bez wartosci zostanie podstawiona wartosc domyslna dla danego typu

    2. Deklaracja tablicy z jednoczesnym przypisaniem wszystkich wartosci - ich ilosc jest rowna wielkosci tablicy
        int[] arr2 = {2, 5, 8};

    3. Tablice wielowymiarowe
        * sa to tablice przechowujace na kazdym indexie inna tablice
        int[][] matrix = new int[5][10];
        System.out.println(matrix[0][0]);

    4. Kopiowanie zawartosci tablicy
        int[] copied = Arrays.copyOf(<base array>, <new length>);
        Jezeli jednak rozmiar bedzie za maly by skopiowac tablice automatycznie zostanie zwiekszony

    5. forEach - printing array content
        for(int i : arrayName) {
            System.out.println(i);
        }

    6. Other loop syntax
        for(int i = 0, j = 2; !(i == 3 || j == -1); i++,j--) {   }

        int sum = 0;
        for (int i = 0; i <= 10; sum += i++);
        System.out.println(sum);

*/

//        int[] arr = new int[10];
//        System.out.println(arr[1]);
//
//        int[] arr2 = {2, 5, 8};
//        System.out.println(arr2.length);
//
//        int[][] matrix = new int[5][10];
//        matrix[0][0] = 10;
//        System.out.println(matrix[0][0]);
//
//        System.out.println("-----------------");
//
//        int[] base = {0, 2, 4, 8, 16};
//        int[] copied = Arrays.copyOf(base, base.length);
//        for (int i = 0; i < copied.length; i++) {
//            System.out.println(copied[i]);
//        }

//        int[] ages = new int[5];
//        Arrays.fill(ages, 0, 5, 13);
//        for (int i : ages) {
//            System.out.println(i);
//        }
//        ages[4] = 25;
//        System.out.println("Index of 25: " + Arrays.binarySearch(ages, 25));

//        int[] arr1 = {2, 4, 8};
//        int[] arr2 = {2, 4, 8};
//        int[] arr3 = {356, 4, 8};
//        boolean sameArrays = Arrays.equals(arr1, arr2); // musza byc identyczne
//        boolean sameArrays2 = Arrays.equals(arr1, arr3);
//        System.out.println(sameArrays+"  "+sameArrays2);

//        int[] someArr = {25, 18, -2, 0};
//        Arrays.sort(someArr);
//        for (int some : someArr) {
//            System.out.println(some);
//        }

//        int sum = 0;
//        for (int i = 0; i <= 10; sum += i++);
//        System.out.println(sum);



    }
}
