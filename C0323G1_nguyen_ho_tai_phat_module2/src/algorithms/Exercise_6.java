package algorithms;

import java.util.*;

public class Exercise_6 {
    public static void main(String[] args) {
        //Yêu cầu:
        //Viết hàm truyền vào một chuỗi findChar(string)
        //Hàm trả về 1 mảng chứa các ký tự xuất hiện nhiều hơn 1 lần trong chuỗi. Nếu không có ký tự nào xuất hiện nhiều hơn 1 lần thì trả về mảng rỗng
        //Input: 1 chuỗi ký tự
        //Output: 1 mảng ký tự
        //Ví dụ:
        //-	findChar (“abcbdcef”) => [b,c]
        //-	findChar (“abdcef”) => []
        //Test case:
        //-	Input: abcbdcef
        //Output: [b,c]
        //-	Input: abdcef
        //Output: []
        //-	Input: abdcef123d
        //Output: [d]
        //-	Input: abdceffecdba
        //Output: [a,b,c,d,e,f]
        //-	Input: a
        //Output: []

        String str = "abdceffecdba";
        System.out.println(findChar(str));

    }

    public static List<String> findChar(String str) {
        String[] string = str.split("");
        List<String> list = new ArrayList<>(Arrays.asList(string));
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        List<String> newList = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key) >1){
                newList.add(key);
            }
        }
        return  newList;

    }
}
