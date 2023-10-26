package org.example;

// 1. Написать метод, возвращающий количество четных элементов массива
public class CountEvens extends Main {
    public static int countEvens(int [] arr)  {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
