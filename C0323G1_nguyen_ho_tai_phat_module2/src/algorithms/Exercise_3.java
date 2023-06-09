package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_3 {
    public static void main(String[] args) {
        //Hãy kiểm tra xem một mảng bất kì có phải là một mảng "đẹp" hay không?
        //Input: 1 chuỗi chứa dãy số nguyên, mỗi số cách nhau bởi 1 dấu “,”
        //Output: 1 giá trị Boolean
        //-	Input: 1, 2, 3
        //Output: false
        //-	Input: 1, 2, 3, 3
        //Output: true
        //-	Input: 1, 2, 3, 4
        //Output: false
        //-	Input: 3, 2, 4, 5, 9
        //Output: true
        //-	Input: 1, 2, -1, 2
        //Output: true

        String str = "1,2,-1,2";
        System.out.println(checkBeautifulArray(str));
    }

    public static boolean checkBeautifulArray(String str) {
        String[] arr = str.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 1; i < list.size() - 1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < list.size(); j++) {
                if (j < i) {
                    sum1 += Integer.parseInt(list.get(j));
                }
                if (j > i) {
                    sum2 += Integer.parseInt(list.get(j));
                }
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }
}