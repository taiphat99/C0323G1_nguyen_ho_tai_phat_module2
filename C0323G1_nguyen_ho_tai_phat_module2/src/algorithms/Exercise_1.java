package algorithms;

import java.util.*;

public class Exercise_1 {
    public static void main(String[] args) {

        //Cho một mảng số nguyên Hãy kiểm tra xem tần số xuất hiện của tất cả các số nguyên trong mảng có bằng nhau hay không?
        //Input: 1 chuỗi chứa dãy số nguyên, mỗi số cách nhau bởi 1 dấu “,”
        //Output: 1 giá trị Boolean

        //-	Input: 1, 2, 2, 1
        //Output: true

        //-	Input: 1, 2, 2, 3, 1, 3, 1, 3
        //Output: false

        //- Input: 100
        //Output: false

        String str = "1,2,2,1";
        System.out.println(checkEqualFrequency(str));
    }

    public static boolean checkEqualFrequency(String str) {
        List<String> list = Arrays.asList(str.split(","));
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        List<Integer> valueList = new ArrayList<>();
        if (map.size() < 2) {
            return false;
        } else {
            for (String s : map.keySet()) {
                valueList.add(map.get(s));
            }
            for (int i = 1; i < valueList.size(); i++) {
                if(!valueList.get(0).equals(valueList.get(i))){
                    return false;
                }
            }
            return true;
        }
    }
}
