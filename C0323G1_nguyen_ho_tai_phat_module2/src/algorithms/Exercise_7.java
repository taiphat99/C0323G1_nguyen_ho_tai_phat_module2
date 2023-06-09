package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Exercise_7 {

    public static void main(String[] args) {
        //Level: Dễ
        //Yêu cầu:
        //Viết hàm truyền vào một mảng 2 chiều (n x n) chứa các số nguyên bất kỳ
        //Hàm sẽ trả về 1 mảng (1 chiều) các số nguyên tố đã được sắp xếp tăng dần.
        //Với các phần tử là các số nguyên tố xuất hiện trong mảng 2 chiều.
        System.out.println(checkPrime(33));
        List<Integer> finalList = new ArrayList<>();
        int[][] array = {{1, 31, 6}, {91, 71, 57}, {2, 13, 11}, {10, 9, 4}, {7, 4, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (checkPrime(array[i][j])) {
                    finalList.add(array[i][j]);
                }
            }
        }
        for (int i = 0; i < finalList.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < finalList.size(); j++) {
                if (finalList.get(min) > finalList.get(j)) {
                    min = j;
                }
                if (min != i) {
                    int temp = finalList.get(min);
                    finalList.set(min, finalList.get(i));
                    finalList.set(i, temp);
                }
            }
        }
        System.out.println(finalList);
    }

    public static boolean checkPrime(int number) {
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number >= 2;
    }
}