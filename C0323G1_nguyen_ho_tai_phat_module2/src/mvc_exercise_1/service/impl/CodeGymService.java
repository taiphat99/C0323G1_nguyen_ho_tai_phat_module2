package mvc_exercise_1.service.impl;

import mvc_exercise_1.model.Person;
import mvc_exercise_1.model.ext.Student;
import mvc_exercise_1.model.ext.Teacher;
import mvc_exercise_1.repository.ICodeGymRepository;
import mvc_exercise_1.repository.impl.CodeGymRepository;
import mvc_exercise_1.service.ICodeGymService;

import java.util.List;
import java.util.Scanner;

public class CodeGymService implements ICodeGymService {
    final private Scanner sc = new Scanner(System.in);
    final private ICodeGymRepository codeGymRepository = new CodeGymRepository();

    @Override
    public void add() {
        System.out.println("Bạn muốn thêm đối tượng nào? \n" +
                "1. Giáo Viên \n" +
                "2. Học Viên");
        int option = Integer.parseInt(sc.nextLine());
        if (option == 1) {
            addTeacher();
        } else if (option == 2) {
            addStudent();
        }
    }

    public void addTeacher() {
        System.out.println("Vui lòng nhập ID Giảng Viên: ");
        String id = sc.nextLine();
        if (codeGymRepository.checkIdTeacher(id) != null && codeGymRepository.checkIdStudent(id) != null) {
            System.err.println("ID của Giảng Viên này đã tồn tại!");
        } else {
            System.out.println("Vui lòng nhập Họ và tên: ");
            String name = sc.nextLine();
            System.out.println("Vui lòng nhập ngày tháng năm sinh: ");
            String dateOfBirth = sc.nextLine();
            boolean gender;
            do {
                System.out.println("Vui lòng nhập giới tính: \n" +
                        "1. Nam \n" +
                        "2. Nữ ");
                try {
                    int genderOption = Integer.parseInt(sc.nextLine());
                    if (genderOption == 1) {
                        gender = true;
                        break;
                    } else if (genderOption == 2) {
                        gender = false;
                        break;
                    } else {
                        System.err.println("Giới tính không hợp lệ!");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Giới tính không hợp lệ");
                }
            } while (true);
            System.out.println("Vui lòng nhập chuyên môn: ");
            String major = sc.nextLine();
            System.out.println("Thêm mới thành công!");
            Teacher teacher = new Teacher(id, name, dateOfBirth, gender, major);
            codeGymRepository.addTeacher(teacher);
        }
    }

    public void addStudent() {
        System.out.println("Vui lòng nhập ID Học Viên: ");
        String id = sc.nextLine();
        if (codeGymRepository.checkIdTeacher(id) != null && codeGymRepository.checkIdStudent(id) != null) {
            System.err.println("ID của Học viên này đã tồn tại");
        } else {
            System.out.println("vui lòng nhập họ và tên: ");
            String name = sc.nextLine();
            System.out.println("Vui lòng nhập ngày tháng năm sinh: ");
            String dateOfBirth = sc.nextLine();
            boolean gender;
            do {
                System.out.println("Vui lòng nhập giới tính \n" +
                        "1. Nam \n" +
                        "2. Nữ ");
                try {
                    int genderOption = Integer.parseInt(sc.nextLine());
                    if (genderOption == 1) {
                        gender = true;
                        break;
                    } else if (genderOption == 2) {
                        gender = false;
                        break;
                    } else {
                        System.err.println("Giới tính không hợp lệ!");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Giới tính không hợp lệ!");
                }
            } while (true);
            System.out.println("Vui lòng nhập lớp: ");
            String className = sc.nextLine();
            float grade;
            do {
                System.out.println("Vui lòng nhâp điểm Học Viên: ");
                try {
                    grade = Float.parseFloat(sc.nextLine());
                    if (grade >= 0 && grade <= 10) {
                        System.out.println("Thêm thành công!");
                        break;
                    } else {
                        System.err.println("Điểm không hợp lệ!");
                    }
                } catch (NumberFormatException n) {
                    System.err.println("Điểm không hợp lệ!");
                }
            } while (true);
            System.out.println("Thêm mới thành công!");
            Student student = new Student(id, name, dateOfBirth, gender, className, grade);
            codeGymRepository.addStudent(student);
        }
    }

    @Override
    public void delete() {
        System.out.println("Vui lòng chọn đối tượng muốn xoá: \n" +
                "1. Giảng Viên \n" +
                "2. Học Viên");
        do {
            try {
                int deleteOption = Integer.parseInt(sc.nextLine());
                if (deleteOption == 1) {
                    System.out.println("Vui lòng nhâp ID muốn xoá: ");
                    String id = sc.nextLine();
                    Person checkTeacherExist = codeGymRepository.checkIdTeacher(id);
                    if (checkTeacherExist == null) {
                        System.err.println("Không tìm thấy ID này!");
                    } else {
                        do {
                            System.out.println("Bạn có chắc muốn xoá ID dưới đây không? \n" +
                                    "1. Có \n" +
                                    "2. Không");
                            System.out.println(codeGymRepository.checkIdTeacher(id));
                            try {
                                int confirmOption = Integer.parseInt(sc.nextLine());
                                if (confirmOption == 1) {
                                    codeGymRepository.removeTeacher(checkTeacherExist);
                                    System.out.println("Xoá Thành công!");
                                    break;
                                } else if (confirmOption == 2) {
                                    System.out.println("Xoá không thành công!");
                                    break;
                                } else {
                                    System.err.println("Không hợp lệ!");
                                }
                            } catch (NumberFormatException n) {
                                System.err.println("Không hợp lệ");
                            }
                        } while (true);
                    }
                    break;
                } else if (deleteOption == 2) {
                    System.out.println("Vui lòng nhâp ID muốn xoá: ");
                    String id = sc.nextLine();
                    Person checkStudentExist = codeGymRepository.checkIdStudent(id);
                    if (checkStudentExist == null) {
                        System.err.println("Không tìm thấy ID này!");
                    } else {
                        do {
                            System.out.println("Bạn có chắc muốn xoá ID dưới đây không? \n" +
                                    "1. Có \n" +
                                    "2. Không");
                            System.out.println(codeGymRepository.checkIdStudent(id));
                            try {
                                int confirmOption = Integer.parseInt(sc.nextLine());
                                if (confirmOption == 1) {
                                    codeGymRepository.removeStudent(checkStudentExist);
                                    System.out.println("Xoá Thành công!");
                                    break;
                                } else if (confirmOption == 2) {
                                    System.out.println("Xoá không thành công!");
                                    break;
                                } else {
                                    System.err.println("Không hợp lệ!");
                                }
                            } catch (NumberFormatException n) {
                                System.err.println("Không hợp lệ");
                            }
                        } while (true);
                    }
                    break;
                } else {
                    System.err.println("Không hợp lệ!");
                }
            } catch (NumberFormatException n) {
                System.err.println("Không hợp lệ!");
            }
        } while (true);
    }

    @Override
    public void display() {
        System.out.println("Vui lòng chọn đối tượng muốn hiển thị: \n" +
                "1. Giáo Viên \n" +
                "2. Học Viên \n" +
                "3. Tất cả mọi người");
        int optionDisplay = Integer.parseInt(sc.nextLine());
        if (optionDisplay == 1) {
            List<Person> teacherList = codeGymRepository.getTeacherList();
            for (Person t : teacherList) {
                System.out.println(t);
            }
        } else if (optionDisplay == 2) {
            List<Person> studentList = codeGymRepository.getStudentList();
            for (Person s : studentList) {
                System.out.println(s);
            }
        } else if (optionDisplay == 3) {
            List<Person> personList = codeGymRepository.getAll();
            for (Person p : personList) {
                System.out.println(p);
            }
        }

    }

    @Override
    public void edit() {
        //coming soon =))
    }

    @Override
    public void find() {
        System.out.println("Vui lòng nhập tên bạn muốn tìm: ");
        String name = sc.nextLine();
        List<Person> findingList = codeGymRepository.searchByName(name);
        if (findingList == null) {
            System.err.println("Không tìm thấy đối tượng!");
        } else {
            for (Object p : findingList) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void displayLeaderBoard() {

    }
}
