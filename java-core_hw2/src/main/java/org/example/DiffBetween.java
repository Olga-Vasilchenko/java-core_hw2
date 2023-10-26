package org.example;

// 2. Написать функцию, возвращающую разницу между самым большим
//    и самым маленьким элементами переданного не пустого массива.
public class DiffBetween extends Main {
    public static int differenceBetween(int [] arr) {

        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }
}
