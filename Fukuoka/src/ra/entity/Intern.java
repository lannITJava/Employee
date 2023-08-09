package ra.entity;

import java.util.Scanner;

public class Intern extends Employee{
    private String majors;
    private String semester;
    private String universityName;

    public Intern(String fullName, String birthDay, String phone, String email, String majors, String semester, String universityName) {
        super(); // EmployeeType = 2 for Intern
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }


    public void inputIntern(Scanner scanner){
        super.inputEmployee(scanner);
        System.out.println("Nhập vào chuyên ngành đang học");
        this.majors = scanner.nextLine();
        System.out.println("Nhập vào học kỳ đang học");
        this.semester = scanner.nextLine();
        System.out.println("Nhập vào tên trường đang học");
        this.universityName = scanner.nextLine();
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

//    @Override
//    public void showInformation() {
//
//    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                ", iD='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                "} " ;
    }

    @Override
    public void showInformation() {
        System.out.println("ID: " + iD);
        System.out.println("Full Name: " + fullName);
        System.out.println("BirthDay: " + birthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Employee Type: Intern");
        System.out.println("Majors: " + majors);
        System.out.println("Semester: " + semester);
        System.out.println("University Name: " + universityName);
        System.out.println("Employee Count: " + employeeCount);
    }
}
