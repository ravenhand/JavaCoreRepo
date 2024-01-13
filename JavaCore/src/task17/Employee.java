package task17;

public abstract class Employee {
    protected String position;
    protected String name;
    protected int salary;
    protected String customField;

    public Employee(String position, String name, int salary, String customField) {
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.customField = customField;
    }

    @Override
    public String toString() {
        return
                "position: " + position +
                        System.lineSeparator() +
                "name: " + name +
                        System.lineSeparator() +
                "salary: " + salary +
                        System.lineSeparator() +
                "customField: " + customField +
                        System.lineSeparator() +
                        "----------------"+
                        System.lineSeparator();

    }
}
