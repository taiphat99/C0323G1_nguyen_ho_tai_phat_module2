package ss13_searching_algorithms.exercise.exercise_3;

import java.util.LinkedList;

public class FindMaximumSubsequence {
    public static void main(String[] args) {
        String str = "abcdxyzabcdegh";
        LinkedList<Character> tempList;
        LinkedList<Character> list = new LinkedList<>();
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            tempList = new LinkedList<>();
            tempList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > str.charAt(j - 1)) {
                    tempList.add(str.charAt(j));
                } else {
                    break; // Nếu ký tự sau bé hơn hoặc = ký tự trước thì ngắt vòng lặp ==> Tiết kiệm vòng lặp
                }
            }
            if (tempList.size() > max) {
                list.clear();
                list.addAll(tempList);
                max = tempList.size();
            }

        }
        for (Character character : list) {
            System.out.print(character);
        }

    }
}
