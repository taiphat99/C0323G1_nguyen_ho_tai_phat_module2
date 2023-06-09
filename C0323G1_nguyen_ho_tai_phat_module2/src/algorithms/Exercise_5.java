package algorithms;

import java.util.Arrays;

public class Exercise_5 {
    public static void main(String[] args) {
//Yêu cầu:
        //Nhiệm vụ của bạn là thay đổi vị trí của họ, sao cho chiều cao của họ tạo thành một dãy tăng dần (không tính cây). Chú ý rằng cây không thể di chuyển.
        //
        //Input: 1 chuỗi chứa dãy số nguyên, mỗi số cách nhau bởi 1 dấu “,”
        //
        //Output: 1 mảng số nguyên
        //Ví dụ:
        //Với a = []
        // --> kết quả sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(sortByHeight(arr)));

    }
    public static int[] sortByHeight(int[] arr) {
        int temp;
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min] && arr[j] != -1 && arr[min] != -1) {
                    min = j;
                }
            }
            if (i != min) {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
