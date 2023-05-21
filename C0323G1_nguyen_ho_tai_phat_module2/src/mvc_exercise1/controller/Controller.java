package mvc_exercise1.controller;

import mvc_exercise1.service.Service;
import mvc_exercise1.service.impl.IService;

import java.util.Scanner;

public class Controller {
    private static IService service = new Service();
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-----------\n" +
                    "1. Thêm mới giảng viên hoặc học sinh \n" +
                    "2. Xoá giảng viên hoặc học sinh \n" +
                    "3. Xem danh sách giảng viên hoặc học sinh \n" +
                    "4. Thoát \n" +
                    "Vui lòng chọn chức năng để tiếp tục: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.add();
                    break;
                case 2:
                    service.delete();
                    break;
                case 3:
                    service.display();
                    break;
                case 4:
                    System.out.println("Bạn đã nhấn thoát chương trình");
                    System.exit(0);
            }
        }
        while (true);

    }

}
