package demo_exam.controller;

import demo_exam.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private final ProductService productService = new ProductService();
    private final Scanner sc = new Scanner(System.in);

    public void menu() {
        loop:
        do {
            System.out.println("----------Product Management----------\n" +
                    "1. Display all products\n" +
                    "2. Add new product\n" +
                    "3. Delete product\n" +
                    "4. Exit\n" +
                    "Enter function below: ");
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    productService.display();
                    break;
                case "2":
                    productService.add();
                    break;
                case "3":
                    productService.delete();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Invalid Number!");
            }
        } while (true);
    }


}
