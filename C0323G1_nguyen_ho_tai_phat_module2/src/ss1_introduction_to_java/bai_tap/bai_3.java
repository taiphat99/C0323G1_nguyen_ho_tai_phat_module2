package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number here! ");
        int number = sc.nextInt();
        String str = Integer.toString(number);

        String[] array = str.split("");
        String hundreds = array[0];
        String tens = array[1];
        String ones = array[2];

        if (number >= 100) {
            switch (hundreds) {
                case "1":
                    System.out.print("One hundred ");
                    break;
                case "2":
                    System.out.print("Two hundred ");
                    break;
                case "3":
                    System.out.print("Three hundred ");
                    break;
                case "4":
                    System.out.print("Four hundred ");
                    break;
                case "5":
                    System.out.print("Five hundred ");
                    break;
                case "6":
                    System.out.print("Six hundred ");
                    break;
                case "7":
                    System.out.print("Seven hundred ");
                    break;
                case "8":
                    System.out.print("Eight hundred ");
                    break;
                case "9":
                    System.out.print("Nine hundred ");
                    break;
                default:
                    System.out.print("");
            }

            if (!tens.equals("1")) {
                switch (tens) {
                    case "2":
                        System.out.print("twenty ");
                        break;
                    case "3":
                        System.out.print("thirty ");
                        break;
                    case "4":
                        System.out.print("fourty ");
                        break;
                    case "5":
                        System.out.print("fifty ");
                        break;
                    case "6":
                        System.out.print("sixty ");
                        break;
                    case "7":
                        System.out.print("seventy ");
                        break;
                    case "8":
                        System.out.print("eighty ");
                        break;
                    case "9":
                        System.out.print("ninety ");
                    default:
                        System.out.print("");
                }
                switch (ones) {
                    case "1":
                        System.out.print("one");
                        break;
                    case "2":
                        System.out.print("two");
                        break;
                    case "3":
                        System.out.print("three");
                        break;
                    case "4":
                        System.out.print("four");
                        break;
                    case "5":
                        System.out.print("five");
                        break;
                    case "6":
                        System.out.print("six");
                        break;
                    case "7":
                        System.out.print("seven");
                        break;
                    case "8":
                        System.out.print("eight");
                        break;
                    case "9":
                        System.out.print("nine");
                        break;
                    default:
                        System.out.print("");
                }
            } else {
                switch (ones) {
                    case "0":
                        System.out.print("ten ");
                        break;
                    case "1":
                        System.out.print("eleven ");
                        break;
                    case "2":
                        System.out.print("twelve ");
                        break;
                    case "3":
                        System.out.print("thirteen");
                        break;
                    case "4":
                        System.out.print("fourteen");
                        break;
                    case "5":
                        System.out.print("fifteen");
                        break;
                    case "6":
                        System.out.print("sixteen");
                        break;
                    case "7":
                        System.out.print("seventeen");
                        break;
                    case "8":
                        System.out.print("eighteen");
                        break;
                    case "9":
                        System.out.print("nineteen");
                        break;
                    default:
                        System.out.print("");
                }
            }
        } else {


        }
    }
}