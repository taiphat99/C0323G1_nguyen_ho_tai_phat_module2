package algorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(a)));

    }
    static int[] solution (int[] a){
        int min;
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j] && a[min] != -1 && a[j]!= -1) {
                    min = j;
                }
            }
            if (min != i) {
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        return a;
    }
}
