package ss13_searching_algorithms.exercise.exercise_1;

import java.util.LinkedList;

public class FindMaximumSubsequencePlus {
    public static void main(String[] args) {
        String str = "xyzabcxyzabcabcdxyzbcdefgh";
        LinkedList<LinkedList<Character>> linkedLists = new LinkedList<>(); //Mảng đa chiều để lưu các chuỗi tăng dần
        LinkedList<Character> tempString;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            tempString = new LinkedList<>();
            tempString.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > tempString.getLast()) {
                    tempString.add(str.charAt(j));
                }
            }
            linkedLists.add(tempString);
            if (tempString.size() > max) {
                max = tempString.size();
            }
        }
        int size;
        for (LinkedList<Character> linkedList : linkedLists) { // duyệt tìm thử xem có các chuỗi có độ dài bằng max không để in ra hết!
            size = linkedList.size();
            if (max == size) {
                System.out.print(linkedList);
            }
        }
    }
}
