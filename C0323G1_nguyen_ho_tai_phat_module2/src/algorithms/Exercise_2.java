package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_2 {

    public static void main(String[] args) {
        //Input:
        //Dòng đầu tiên là 1 chuỗi ký tự
        //Dòng thứ 2 là 1 chuỗi ký tự khác cần so sánh với chuỗi trên

        //Output: 1 giá trị số nguyên
        //Ví dụ:
        //Với str1 = "aabcc" và str2 = "adcaa", thì kết quả commonCharacterCount(s1, s2) = 3.
        //Vì xâu s1 và s2 có 3 kí tự chung: 2 kí tự 'a' và 1 kí tự 'c'.
        String str1 = "abcccc";
        String str2 = "bcdccc";
        System.out.println(commonCharacterCount(str1,str2));

    }

    public static int commonCharacterCount(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        int count = 0;
        for (String s : list1) {
            for (int j = 0; j < list2.size(); j++) {
                if (s.equals(list2.get(j))) {
                    count++;
                    list2.remove(j);
                    break;
                }
            }
        }
        return count;
    }


}
