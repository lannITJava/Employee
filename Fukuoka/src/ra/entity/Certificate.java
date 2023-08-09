package ra.entity;

import java.util.Scanner;

public class Certificate {
    private int certificatedID;
    private String certificatedName;
    private String certificatedRank;
    private String certificatedDate;

    public Certificate() {
        this.certificatedID = certificatedID;
        this.certificatedName = certificatedName;
        this.certificatedRank = certificatedRank;
        this.certificatedDate = certificatedDate;
    }

    public int getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificatedName() {
        return certificatedName;
    }

    public void setCertificatedName(String certificatedName) {
        this.certificatedName = certificatedName;
    }

    public String getCertificatedRank() {
        return certificatedRank;
    }

    public void setCertificatedRank(String certificatedRank) {
        this.certificatedRank = certificatedRank;
    }

    public String getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        this.certificatedDate = certificatedDate;
    }

//    public void inputCertificate(Scanner scanner){
//        System.out.println("Nhập vào ID của bằng");
//        this.certificatedID = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập vào tên bằng");
//        this.certificatedName= scanner.nextLine();
//        System.out.println("Nhập vào xếp loại");
//        this.certificatedRank = scanner.nextLine();
//        System.out.println("Nhập vào thời gian cấp bằng");
//        this.certificatedDate = scanner.nextLine();
//    }

}
