package task15;

public abstract class Salary {
    protected abstract void salaryCalculation(double dailySalary, double workedDay);

    protected void writeThanksNote(){
        System.out.println("Thanks for using me and let me assist in your calculation");
    }
}