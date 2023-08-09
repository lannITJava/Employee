package ra.run;

import ra.entity.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeManager {
    static ManagerEmployee managerEmployee = new ManagerEmployee();
    static int index =0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("************MENU************");
            System.out.println("1.Thêm mới nhân viên");
            System.out.println("2.Sửa thông tin nhân viên (theo ID)");
            System.out.println("3.Xóa thông tin nhân viên (theo ID)");
            System.out.println("4.In ra thông tin nhân viên Intern");
            System.out.println("5.In ra thông tin nhân viên Fresher");
            System.out.println("6.In ra thông tin nhân viên Experience");
            System.out.println("7.Thoát");
            System.out.println("Sự lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    EmployeeManager.inputListEmployee(scanner);
                    break;
                case 2:
                    EmployeeManager.update(scanner);
                    break;
                case 3:
                    EmployeeManager.removeEmployee(scanner);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-7");
            }
        }while (true);
    }
    public static void inputListEmployee(Scanner scanner){
        System.out.println("Nhập thông tin nhân viên mới:");
        System.out.println("Nhập vào ID nhân viên");
        int iD = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên nhân viên");
        String fullName= scanner.nextLine();
        System.out.println("Nhập vào ngày tháng năm sinh của nhân viên");
        boolean checkBirthDay = true;
        String birthDay;
        String birthDayRegex = "(^0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4}$)";
        do {
            birthDay = scanner.nextLine();
            if (Pattern.matches(birthDayRegex, birthDay)){
                break;
            }else {
                System.err.println("Ngày tháng năm sinh không hợp lệ, vui lòng nhập lại");
            }
        }while (checkBirthDay);

        System.out.println("Nhập vào số điện thoại");
        boolean checkPhone = true;
        String phone;
        String phoneRegex = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
        do {
             phone = scanner.nextLine();
            if (!Pattern.matches(phoneRegex, phone)) {
                System.err.println("Số điện thoại không hợp lệ, vui lòng nhập lại");
            } else {
                break;
            }
        }while (checkPhone);

        System.out.println("Nhập vào email nhân viên");
        boolean checkEmail = true;
        String email;
        String emailRegex = "[a-zA-Z0-9]{6,}@[a-zA-Z0-9]{3,10}.[a-zA-Z]{2,3}";
        do {
            email= scanner.nextLine();
            if (!Pattern.matches(emailRegex, email)){
                System.out.println("Email không hợp lệ, vui lòng nhập lại");
            }else {
                break;
            }
        }while (checkEmail);
        System.out.println("Nhập vào loại ứng viên muốn thêm mới ( 0: Experience, 1: Fresher , 2: Intern )");
                        int choiceType = Integer.parseInt(scanner.nextLine());
        Employee newEmployee = null;
                        switch (choiceType){
                            case 0:
                                System.out.print("Số năm kinh nghiệm: ");
                                int expInYear = Integer.parseInt(scanner.nextLine());
                                System.out.print("Kỹ năng chuyên môn: ");
                                String proSkill = scanner.nextLine();
                                newEmployee = new Experience(fullName, birthDay,phone, email, expInYear, proSkill);
                                break;
                            case 1:
                                System.out.print("Thời gian tốt nghiệp: ");
                                String graduationDate = scanner.nextLine();

                                System.out.print("Xếp loại tốt nghiệp: ");
                                String graduationRank = scanner.nextLine();

                                System.out.print("Trường tốt nghiệp: ");
                                String education = scanner.nextLine();

                                newEmployee = new Fresher(fullName, birthDay, phone, email, graduationDate, graduationRank, education);
                                break;
                            case 2:
                                System.out.print("Chuyên nghàng đang học: ");
                                String majors = scanner.nextLine();

                                System.out.print("Học kỳ đang học: ");
                                String semester = scanner.nextLine();

                                System.out.print("Tên trường đang học: ");
                                String universityName = scanner.nextLine();

                                newEmployee = new Intern(fullName, birthDay, phone, email, majors, semester, universityName);
                                break;
                            default:
                                System.err.println("Vui lòng chọn từ 0-2");
                        }
        if (newEmployee != null) {
            ManagerEmployee.addEmployee(newEmployee);
            System.out.println("Thêm nhân viên thành công.");
        }
    }
    public static void removeEmployee(Scanner scanner){
        System.out.print("Nhập ID nhân viên cần xóa: ");
        int deleteId = Integer.parseInt(scanner.nextLine());
        ManagerEmployee.deleteEmployee(deleteId);
        System.out.println("Xóa nhân viên thành công.");
    }
    public static void update(Scanner scanner){
        System.out.print("Nhập ID nhân viên cần chỉnh sửa: ");
        int updateId = Integer.parseInt(scanner.nextLine());
        Employee existEmployee = ManagerEmployee.getEmployeeById(updateId);
        if (existEmployee==null){
            System.out.println("Không tìm thấy nhân viên có ID tương ứng.");
        }else {
            System.out.println("Nhập thông tin mới cho nhân viên:");
            System.out.println("Nhập lại tên nhân viên");
            String fullName= scanner.nextLine();
            System.out.println("Nhập lại ngày tháng năm sinh của nhân viên");
            boolean checkBirthDay = true;
            String birthDay;
            String birthDayRegex = "(^0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4}$)";
            do {
                birthDay = scanner.nextLine();
                if (Pattern.matches(birthDayRegex, birthDay)){
                    break;
                }else {
                    System.err.println("Ngày tháng năm sinh không hợp lệ, vui lòng nhập lại");
                }
            }while (checkBirthDay);

            System.out.println("Nhập lại số điện thoại");
            boolean checkPhone = true;
            String phone;
            String phoneRegex = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
            do {
                phone = scanner.nextLine();
                if (!Pattern.matches(phoneRegex, phone)) {
                    System.err.println("Số điện thoại không hợp lệ, vui lòng nhập lại");
                } else {
                    break;
                }
            }while (checkPhone);

            System.out.println("Nhập lại email nhân viên");
            boolean checkEmail = true;
            String email;
            String emailRegex = "[a-zA-Z0-9]{6,}@[a-zA-Z0-9]{3,10}.[a-zA-Z]{2,3}";
            do {
                email= scanner.nextLine();
                if (!Pattern.matches(emailRegex, email)){
                    System.err.println("Email không hợp lệ, vui lòng nhập lại");
                }else {
                    break;
                }
            }while (checkEmail);
            System.out.println("Nhập vào loại ứng viên muốn chỉnh sửa ( 0: Experience, 1: Fresher , 2: Intern )");
            int choiceType = Integer.parseInt(scanner.nextLine());
            Employee newEmployee = null;
            switch (choiceType){
                case 0:
                    System.out.print("Số năm kinh nghiệm: ");
                    int expInYear = Integer.parseInt(scanner.nextLine());
                    System.out.print("Kỹ năng chuyên môn: ");
                    String proSkill = scanner.nextLine();
                    newEmployee = new Experience( fullName, birthDay,phone, email, expInYear, proSkill);
                    break;
                case 1:
                    System.out.print("Thời gian tốt nghiệp: ");
                    String graduationDate = scanner.nextLine();

                    System.out.print("Xếp loại tốt nghiệp: ");
                    String graduationRank = scanner.nextLine();

                    System.out.print("Trường tốt nghiệp: ");
                    String education = scanner.nextLine();

                    newEmployee = new Fresher(fullName, birthDay, phone, email, graduationDate, graduationRank, education);
                    break;
                case 2:
                    System.out.print("Chuyên nghàng đang học: ");
                    String majors = scanner.nextLine();

                    System.out.print("Học kỳ đang học: ");
                    String semester = scanner.nextLine();

                    System.out.print("Tên trường đang học: ");
                    String universityName = scanner.nextLine();

                    newEmployee = new Intern( fullName, birthDay, phone, email, majors, semester, universityName);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 0-2");
            }
            ManagerEmployee.updateEmployee(updateId, newEmployee);
            System.out.println("Chỉnh sửa thông tin nhân viên thành công.");
        }
        }
        public static void getListIntern(){
            ArrayList<Intern> interns = ManagerEmployee.getInterns();
            System.out.println("Danh sách nhân viên Intern:");
            for (Intern intern : interns) {
                intern.showInformation();

            }
        }
    public static void getListFresher(){
        ArrayList<Fresher> freshers = ManagerEmployee.getFreshers();
        System.out.println("Danh sách nhân viên Fresher:");
        for (Fresher fresher : freshers) {
            fresher.showInformation();
        }
    }
    public static void getListExperience(){
        ArrayList<Experience> experiences = ManagerEmployee.getExperiences();
        System.out.println("Danh sách nhân viên Experience:");
        for (Experience experience : experiences) {
            experience.showInformation();
        }
    }
}
