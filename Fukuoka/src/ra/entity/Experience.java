package ra.entity;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;
    public Experience(String fullName, String birthDay, String phone, String email, int expInYear, String proSkill) {
        super(); // EmployeeType = 0 for Experience
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    @Override
    public void showInformation() {
        System.out.println("ID: " + iD);
        System.out.println("Full Name: " + fullName);
        System.out.println("BirthDay: " + birthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Employee Type: Experience");
        System.out.println("Years of Experience: " + expInYear);
        System.out.println("Professional Skill: " + proSkill);
        System.out.println("Certificate(s): ");
        for (Certificate certificate : certificates) {
            System.out.println("- " + certificate.getCertificatedName() + " - " + certificate.getCertificatedRank());
        }
        System.out.println("Employee Count: " + employeeCount);
    }

//    public void inputExperience(Scanner scanner) {
//    }
}
