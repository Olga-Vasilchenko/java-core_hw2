package org.example;

public class Main {
    public static void main(String[] args) {
       int [] arr = {2, 6, 8, 9, 5, 1, 4} ;
        System.out.printf("Количество четных элементов в массиве: " + CountEvens.countEvens(arr));
        System.out.println();
        System.out.printf("Разница между max и min элементами массива: " + DiffBetween.differenceBetween(arr));
        System.out.println();
        System.out.printf("В переданном массиве есть два соседних элемента с нулевым значением: " + Zero.zeroArray(arr));
    }
}