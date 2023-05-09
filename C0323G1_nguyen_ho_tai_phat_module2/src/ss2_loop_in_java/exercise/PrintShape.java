package ss2_loop_in_java.exercise;

public class PrintShape {
    public static void main(String[] args) {

        System.out.println("1. Print the rectangle");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int width = 10;
        int height = 10;
        System.out.println("2. Print the square triangle");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            width--;
            System.out.println();
        }


        System.out.println("3. ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
