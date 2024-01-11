package task15;

public class HungarianSalary extends Salary {
    protected double hungarianTaxes;
    protected String currency = "HUF";

    public HungarianSalary(double hungarianTaxes) {
        this.hungarianTaxes = hungarianTaxes;
    }

    @Override
    protected void salaryCalculation(double dailySalary, double workedDay) {
        System.out.println("HunMonthlySalary: " + (dailySalary * workedDay)/hungarianTaxes + " " + currency);
    }
}
