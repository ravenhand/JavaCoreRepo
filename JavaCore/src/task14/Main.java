package task14;

public class Main {
    public static void main(String[] args) {
        //Employee e = new Employee("HR", "Tomi", "1000");
        SoftwareTester st = new SoftwareTester("lead", "Zsolt", "100000", 1000);

        HrAssistant hra = new HrAssistant("lead", "Tomi", "1000", false);

        System.out.println(st);
        System.out.println(hra);
    }
}
