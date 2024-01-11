package task15;

public class Runner {
    public static void main(String[] args) {
        HungarianSalary magyarBer = new HungarianSalary(50);
        magyarBer.salaryCalculation(3000,30);
        magyarBer.writeThanksNote();

        NorwaySalary norvegBer = new NorwaySalary(20);
        norvegBer.salaryCalculation(3000,30);
        norvegBer.writeThanksNote();

        USSalary amcsiBer = new USSalary(25);
        amcsiBer.salaryCalculation(3000,30);
        amcsiBer.writeThanksNote();
    }
}
