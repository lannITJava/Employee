package ra.entity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Employee {
    protected int iD;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    protected ArrayList<Certificate> certificates;
    protected int employeeType;
    protected int employeeCount ;

    public Employee() {
        this.iD = this.iD;
        this.fullName = this.fullName;
        this.birthDay = this.birthDay;
        this.phone = this.phone;
        this.email = this.email;
        this.certificates = new ArrayList<>();
        this.employeeType = employeeType;
        this.employeeCount = 0;
    }


   public abstract void showInformation();

    public int getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = Integer.parseInt(iD);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int i) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<Certificate> certificates) {
        this.certificates = certificates;
    }

    public void inputEmployee(Scanner scanner){
        System.out.println("Nhập vào ID nhân viên");
        this.iD = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên nhân viên");
        this.fullName= scanner.nextLine();
        System.out.println("Nhập vào ngày tháng năm sinh của nhân viên");
        boolean checkBirthDay = true;
        String birthDayRegex = "(^0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4}$)";
        do {
            this.birthDay = scanner.nextLine();
            if (Pattern.matches(birthDayRegex,this.birthDay)){
                break;
            }else {
                System.err.println("Ngày tháng năm sinh không hợp lệ, vui lòng nhập lại");
            }
        }while (checkBirthDay);

        System.out.println("Nhập vào số điện thoại");
        boolean checkPhone = true;
        String phoneRegex = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
        do {
            this.phone = scanner.nextLine();
            if (!Pattern.matches(phoneRegex, this.phone)) {
                System.err.println("Số điện thoại không hợp lệ, vui lòng nhập lại");
            } else {
                break;
            }
        }while (checkPhone);

        System.out.println("Nhập vào email nhân viên");
        boolean checkEmail = true;
        String emailRegex = "[a-zA-Z0-9]{6,}@[a-zA-Z0-9]{3,10}.[a-zA-Z]{2,3}";
        do {
            this.email= scanner.nextLine();
            if (!Pattern.matches(emailRegex, this.email)){
                System.out.println("Email không hợp lệ, vui lòng nhập lại");
            }else {
                break;
            }
        }while (checkEmail);
//        System.out.println("Chọn số bằng cấp muốn nhập");
//        int n = Integer.parseInt(scanner.nextLine());
//        int indexCertificates = 0;
//        for (int i = 0; i < n; i++) {
//
//            indexCertificates++;
//        }
//
    }
    public void addCertificate(Certificate certificate){
        this.certificates.add(certificate);
    }

}
