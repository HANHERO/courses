package HW9;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] mass = {1, 7, 6, 8, 2, 0, 3, 4};
        int needFound = 8;
        System.out.println("Заданный массив - " + Arrays.toString(mass));
        System.out.println("Отсортированный массив - " + Arrays.toString(sort(mass)));
        System.out.println("Ищим число " + needFound);
        System.out.println("Заданное число в отсортированном массиве под индексом " + binarySearch(sort(mass), needFound));
    }

    public static int[] sort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int binarySearch(int[] mass, int a) {
        int last = mass.length - 1;
        int mid = last;
        while (mass[mid] != a) {
            if (mass[mid] < a) {
                mid = (last + mid) / 2;
            } else {
                last = mid;
                mid = last / 2;
            }
        }
        return mid;
    }
}