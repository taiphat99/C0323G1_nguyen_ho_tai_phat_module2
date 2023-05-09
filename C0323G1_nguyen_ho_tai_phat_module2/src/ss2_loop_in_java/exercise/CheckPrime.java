package ss2_loop_in_java.exercise;


public class CheckPrime {
    public static void main(String[] args) {
        int countOfPrime = 0;
        int number = 2;
        System.out.println("20 prime numbers below here! ");
        while (countOfPrime < 5) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);
                countOfPrime++;
            }
            number++;
        }

    }
}
