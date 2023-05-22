package ss12_java_collection_framework.product_management.controller;


import ss12_java_collection_framework.product_management.service.IService;
import ss12_java_collection_framework.product_management.service.Impl.Service;

import java.util.Scanner;

public class Controller {
    private static Scanner sc = new Scanner(System.in);
    private static IService service = new Service();
    public static void menu(){
        do {
            System.out.println("----------------------------\n" +
                    "------QUẢN LÝ SẢN PHẨM------ \n" +
                    "\n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Xoá sản phẩm \n" +
                    "3. Sửa thông tin sản phẩm \n" +
                    "4. Hiển thị tất cả sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm \n" +
                    "6. Sắp xếp sản phẩm \n" +
                    "7. Thoát \n" +
                    "Vui lòng lựa chọn chức năng! ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    //add sản phẩm
                    service.addProduct();
                    break;
                case 2:
                    //Delete sản phẩm
                    service.deleteProduct();
                    break;
                case 3:
                    //edit sản phẩm
                    service.editProduct();
                    break;
                case 4:
                    //display;
                    service.displayProduct();
                    break;
                case 5:
                    //search
                    service.searchProduct();
                    break;
                case 6:
                    //order
                    service.sortProduct();
                    break;
                case 7:
                    System.out.println("See you again =))");
                    System.exit(0);
            }
        }
        while(true);
    }

}
