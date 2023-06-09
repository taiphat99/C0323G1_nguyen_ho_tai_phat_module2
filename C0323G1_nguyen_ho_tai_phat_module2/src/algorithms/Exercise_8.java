package algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise_8 {

    public static void main(String[] args) {
//Yêu cầu:
//Tìm số lần xuất hiện mảng con trong mảng cha
//Điều kiện child là con của parent (các phần tử trong mảng child xuất hiện ít nhất 1 lần trong mảng parent)
//
//Input:
//Dòng đầu tiên là 1 chuỗi các số nguyên của mảng parent, mỗi số nguyên sẽ cách nhau bởi dấu “,”
//Dòng thứ 2 là 1 chuỗi các số nguyên của mảng child, mỗi số nguyên sẽ cách nhau bởi dấu “,”
//
//Output: Số lần xuất hiện của mảng con trong mảng cha
        int[] parent = {1, 4, 5, 2, 3, 2, 1, 5, 5, 2, 2, 2, 2, 2, 1};
        int[] child = {1, 2, 5};
        System.out.println(appearanceCount(parent, child));
    }

    public static int appearanceCount(int[] parent, int[] child) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < child.length; i++) {
            int count = 0;
            for (int j = 0; j < parent.length; j++) {
                if (child[i] == parent[j]) {
                    count++;

                }
            }
            map.put(child[i], count);
        }
        int min = map.get(child[0]);
        for (Integer i : map.keySet()) {
            if (map.get(i) < min) {
                min = map.get(i);
            }
        }
        return min;
    }


}
