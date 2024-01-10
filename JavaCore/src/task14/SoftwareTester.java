package task14;

public class SoftwareTester extends Employee{

    private int bugCount;
    public SoftwareTester(String position, String name, String salary, int bugCount) {
        super(position, name, salary);
        this.bugCount = bugCount;
    }

    @Override
    public int computePay() {
        return 10000000;
    }

    @Override
    public String toString() {
        return "SoftwareTester{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
