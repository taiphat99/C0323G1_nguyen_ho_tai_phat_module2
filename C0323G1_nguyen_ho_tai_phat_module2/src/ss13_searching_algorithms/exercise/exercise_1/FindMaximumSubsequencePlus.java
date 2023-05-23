package ss13_searching_algorithms.exercise.exercise_1;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaximumSubsequencePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi ký tự cần tìm chuỗi tăng dần lớn nhất: ");
        // example: str = "xyzabcxyzabcabcdxyzbcdefgh"
        String str = sc.nextLine();
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
        for (int i = 0; i < linkedLists.size(); i++) { // duyệt tìm thử xem có các chuỗi có độ dài bằng max không để in ra hết!
            size = linkedLists.get(i).size();
            if (max == size) {
                for (int j = 0;j<linkedLists.get(i).size();j++) {
                    System.out.print(linkedLists.get(i).get(i));
                }
            }
        }
    }
}
