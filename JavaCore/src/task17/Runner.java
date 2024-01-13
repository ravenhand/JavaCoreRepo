package task17;

public class Runner {
    public static void main(String[] args) {
        EmployeeRegister employeeRegister = new EmployeeRegister();
        employeeRegister.readCSVFile();
        System.out.println(employeeRegister.getEmployees());
    }
}
