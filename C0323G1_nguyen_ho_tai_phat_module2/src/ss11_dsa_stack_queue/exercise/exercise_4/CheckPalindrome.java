package ss11_dsa_stack_queue.exercise.exercise_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        String str1 = "a b   c  dcb a";
        String str2  = "           ";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str1));
        System.out.println(checkPalindrome(str2));
    }

    public static boolean checkPalindrome(String str) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String[] charArray = str.split("");
        for (String s : charArray) {
            stack.push(s.toLowerCase());
            queue.add(s.toLowerCase());
        }
        boolean flag = true;
        int size = stack.size()/2; // chạy chỉ cần chạy đến nửa mảng là đủ kiểm tra chuỗi đối xứng
        for (int i = 0; i < size; i++) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return flag;
    }
}
