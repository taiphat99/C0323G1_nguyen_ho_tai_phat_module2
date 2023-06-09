package algorithms;

public class Exercise_9 {
    public static void main(String[] args) {
//Mô tả:
//Người ta định nghĩa số vòng là một số tự nhiên mà mà chữ số đầu trùng với chữ số cuối của nó. Ví dụ 303, 101, 8, 88 là những số vòng.
//Yêu cầu:
//Cho 2 số nguyên dương L, R, hãy đếm số lượng số vòng trong đoạn [L; R]
//Input:
//Dòng đầu tiên là 1 số nguyên L
//Dòng thứ 2 là 1 số nguyên R
//Output: Số lượng của số vòng trong khoảng [L;R]
        System.out.println(circleNumberCount(10,100));

    }

    public static boolean checkCircleNumber(int number) {
        if (number > 0) {
            if (number <= 9) {
                return true;
            } else {
                String strNumber = String.valueOf(number);
                return strNumber.charAt(0) == strNumber.charAt(strNumber.length() - 1);
            }
        }
        return false;
    }

    public static int circleNumberCount(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (checkCircleNumber(i)) {
                count++;
            }
        }
        return count;
    }
}