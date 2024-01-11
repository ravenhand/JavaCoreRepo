package task15;

public class USSalary extends Salary{
    protected double USTaxes;
    protected String currency = "USD";

    public USSalary(double USTaxes) {
        this.USTaxes = USTaxes;
    }

    @Override
    protected void salaryCalculation(double dailySalary, double workedDay) {
        System.out.println("USMonthlySalary: " + (dailySalary * workedDay) / USTaxes + " " + currency);
    }
}
