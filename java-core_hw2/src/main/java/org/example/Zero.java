package org.example;

//3. Написать функцию, возвращающую истину, если в переданном массиве
//   есть два соседних элемента, с нулевым значением.
public class Zero extends Main {
    public static boolean zeroArray(int [] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
