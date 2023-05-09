package ss3_array_in_java.exercise;

public class FindMin {
    public static void main(String[] args) {
        int[][] array = {{1, 22, 13}, {44, 35, 62}, {23, 68, 66}};
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Minimum: " + min);
    }
}
