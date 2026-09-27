
public class Main {
    public static void main(String[] args) {
  
        EmployeeFactory webDev = EmployeeFactory.getEmployee("webdeveloper");
        Employee em=webDev.createDeveloper();
        System.out.println("Web Developer: " + em.name() + ", Salary: " + webDev.createDeveloper().salary());


         EmployeeFactory androidDev = EmployeeFactory.getEmployee("androiddeveloper");
        System.out.println("Android Developer: " + androidDev.createDeveloper().name() + ", Salary: " + androidDev.salary());
    }
}
