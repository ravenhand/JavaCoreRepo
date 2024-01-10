package task14;

public class HrAssistant extends Employee{

    private boolean noMorePeople;
    @Override
    public int computePay() {
        return 10000;
    }

    public HrAssistant(String position, String name, String salary, boolean noMorePeople) {
        super(position, name, salary);
        this.noMorePeople = noMorePeople;
    }
}
