package task15;

public class NorwaySalary extends Salary {
    protected double norwayTaxes;
    protected String currency = "NOK";

    public NorwaySalary(double norwayTaxes) {
        this.norwayTaxes = norwayTaxes;
    }

    @Override
    protected void salaryCalculation(double dailySalary, double workedDay) {
        System.out.println("NorwayMonthlySalary: " + (dailySalary * workedDay) / norwayTaxes + " " + currency);
    }
}
