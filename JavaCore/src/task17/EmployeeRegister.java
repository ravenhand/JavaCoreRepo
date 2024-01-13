package task17;

import task16.AbstractDog;
import task16.Bulldog;
import task16.CaucasianShepard;
import task16.YorkshireTerrier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {
    private List<Employee> employees = new ArrayList<>();

    void readCSVFile()  {
        List<String> fileContent = null;
        try {
            fileContent = Files.readAllLines(Path.of("JavaCore/resources/employees.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String row: fileContent){
            String[] rowData = row.split(", ");
            String position = rowData[0];
            String name = rowData[1];
            int salary = Integer.parseInt(rowData[2]);
            String customField = rowData[3];

            if (position.equals("Tester")){
                employees.add(new Tester(position, name, salary, customField));
            }else if (position.equals("Developer")){
                employees.add(new Developer(position, name, salary, customField));
            } else if (position.equals("HrAssistant")) {
                employees.add(new HrAssistant(position, name, salary, customField));
            } else if (position.equals("FinanceAssistant")) {
                employees.add(new FinanceAssistant(position, name, salary, customField));
            } else if (position.equals("ExecutiveDirector")) {
                employees.add(new ExecutiveDirector(position, name, salary, customField));
            } else {
                System.out.println("Wrong type");
            }
        }
    }
    public List<Employee> getEmployees(){
        return employees;
    }
}