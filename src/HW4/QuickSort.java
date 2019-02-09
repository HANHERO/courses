package HW4;

import java.util.Arrays;

public class QuickSort {
    int[] massToSort = {6, 345, 98, 12, 4, 7, 2, 98, 129, 76, 32, 4334, 27, 90, 0};

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        System.out.println(Arrays.toString(sort.massToSort));
        sort.doQuickSort(0, sort.massToSort.length - 1);
        System.out.println(Arrays.toString(sort.massToSort));
    }

    public void doQuickSort(int first, int last) {
        if (first >= last)
            return;
        int i = first, j = last;
        int mid = first - (first - last) / 2;
        while (i < j) {
            while (i < mid && (massToSort[i] <= massToSort[mid])) {
                i++;
            }
            while (j > mid && (massToSort[mid] <= massToSort[j])) {
                j--;
            }
            if (i < j) {
                int temp = massToSort[i];
                massToSort[i] = massToSort[j];
                massToSort[j] = temp;
                if (i == mid)
                    mid = j;
                else if (j == mid)
                    mid = i;
            }
        }
        doQuickSort(first, mid);
        doQuickSort(mid + 1, last);
    }
}
