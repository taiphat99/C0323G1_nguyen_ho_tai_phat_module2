package mvc_exercise_1.controller;

import mvc_exercise_1.service.impl.CodeGymService;
import mvc_exercise_1.service.ICodeGymService;

import java.util.Scanner;

public class CodeGymController {
    private static ICodeGymService service = new CodeGymService();
    private static Scanner sc = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("----------------------------------------------");
            System.out.println("-----------HỆ THỐNG CODEGYM ĐÀ NẴNG-----------\n" +
                    "1. Thêm mới giảng viên hoặc học sinh \n" +
                    "2. Xoá giảng viên hoặc học sinh \n" +
                    "3. Xem danh sách giảng viên hoặc học sinh \n" +
                    "4. Sửa thông tin \n" +
                    "5. Tìm kiếm \n" +
                    "6. Bảng xếp hạng học lực \n" +
                    "7. Thoát \n" +
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
                    service.edit();
                    break;
                case 5:
                    service.find();
                    break;
                case 6:
                    // coming soon =))
                    service.displayLeaderBoard();
                    break;
                case 7:
                    System.out.println("Bạn đã nhấn thoát chương trình");
                    System.exit(0);
            }
        }
        while (true);

    }

}
