package ra.entity;

import java.util.Scanner;

public class Fresher extends Employee{
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher(String fullName, String birthDay, String phone, String email, String graduationDate, String graduationRank, String education) {
        super(); // EmployeeType = 1 for Fresher
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public void showInformation() {
        System.out.println("ID: " + iD);
        System.out.println("Full Name: " + fullName);
        System.out.println("BirthDay: " + birthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Employee Type: Fresher");
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Graduation Rank: " + graduationRank);
        System.out.println("Education: " + education);
        System.out.println("Certificate(s): ");
        for (Certificate certificate : certificates) {
            System.out.println("- " + certificate.getCertificatedName() + " - " + certificate.getCertificatedRank());
        }
        System.out.println("Employee Count: " + employeeCount);
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void inputFresher(Scanner scanner){
        super.inputEmployee(scanner);
        System.out.println("Nhập vào thời gian tốt nghiệp");
        this.graduationDate = scanner.nextLine();
        System.out.println("Nhập vào xếp loại tốt nghiệp");
        this.graduationRank = scanner.nextLine();
        System.out.println("Nhập vào trường tốt nghiệp");
        this.education = scanner.nextLine();
    }

//    @Override
//    public void showInformation() {
//
//    }

    @Override
    public String toString() {
        return "Fresher{" +
                "id='" + iD + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthDay +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                "} ";
    }
}
