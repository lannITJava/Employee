package ra.entity;

import java.util.ArrayList;

public class ManagerEmployee {
    private static ArrayList<Employee> employees;
    public ManagerEmployee(){
        this.employees= new ArrayList<>();
    }
    public static void addEmployee(Employee employee){
        employees.add(employee);
        employee.employeeCount++;
    }
    public static Employee getEmployeeById(int iD){
        for (Employee employee : employees) {
            if (employee.getiD() == iD){
                return  employee;
            }
        }
        return null;
    }
    public static void updateEmployee(int iD, Employee updatedEmployee){
        Employee employee = getEmployeeById(iD);
        if (employee!= null){
            employee.setFullName(updatedEmployee.getFullName());
            employee.setBirthDay(updatedEmployee.getBirthDay());
            employee.setPhone(updatedEmployee.getPhone());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setCertificates(updatedEmployee.getCertificates());
        }
    }
    public static void deleteEmployee(int iD){
        Employee employee = getEmployeeById(iD);
        if (employee != null) {
            employees.remove(employee);
        }
    }
    public static ArrayList<Intern> getInterns(){
        ArrayList<Intern> interns = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof Intern) {
                interns.add((Intern) employee);
            }
        }
        return interns;
    }
    public static ArrayList<Experience> getExperiences() {
        ArrayList<Experience> experiences = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof Experience) {
                experiences.add((Experience) employee);
            }
        }
        return experiences;
    }
    public static ArrayList<Fresher> getFreshers() {
        ArrayList<Fresher> freshers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof Fresher) {
                freshers.add((Fresher) employee);
            }
        }
        return freshers;
    }
}
