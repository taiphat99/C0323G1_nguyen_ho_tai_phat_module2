package algorithms;

import java.util.Arrays;

public class Exercise_10 {
    public static void main(String[] args) {
        //Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi
        int[] array = {-5, 5, -4, 4, -3, 3, -2, 2, -1, 1};
        System.out.println(Arrays.toString(sort(array)));

    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < 0 && array[max] < 0) {
                    if (array[j] > array[max]) {
                        max = j;
                    }
                    if (max != i) {
                        int temp = array[max];
                        array[max] = array[i];
                        array[i] = temp;
                    }
                } else if (array[j] > 0 && array[min]>0){
                    if(array[j]<array[min]){
                        min = j;
                    }
                    if(min != i){
                        int temp = array[min];
                        array[min] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        return array;
    }
}