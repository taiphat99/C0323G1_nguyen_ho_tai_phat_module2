package ss17_io_binary_file_and_serialization.exercise.exercise_1.controller;

import ss17_io_binary_file_and_serialization.exercise.exercise_1.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService service = new ProductService();
    private static Scanner sc = new Scanner(System.in);
    public static void menu(){
        do {
            System.out.println("----------------------------\n" +
                    "------QUẢN LÝ SẢN PHẨM------ \n" +
                    "\n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Xoá sản phẩm \n" +
                    "3. Hiển thị tất cả sản phẩm \n" +
                    "4. Tìm kiếm sản phẩm \n" +
                    "5. Thoát \n" +
                    "Vui lòng lựa chọn chức năng! ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    service.addProduct();
                    break;
                case 2:
                    service.deleteProduct();
                    break;
                case 3:
                    service.displayProduct();
                    break;
                case 4:
                    service.searchProduct();
                    break;
                case 5:
                    System.out.println("See you again =))");
                    System.exit(0);
            }
        }
        while(true);
    }
}
