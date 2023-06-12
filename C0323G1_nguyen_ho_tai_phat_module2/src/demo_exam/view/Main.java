package demo_exam.view;

import demo_exam.controller.ProductController;

public class Main {
    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
        productController.menu();
    }
}
