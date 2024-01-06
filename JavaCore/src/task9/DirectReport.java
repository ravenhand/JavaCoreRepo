package task9;

public class DirectReport extends Employee{
    private boolean lunchTime;
    public DirectReport(){
        super();
    }
    public void takesOvertime(){
        System.out.println("The direct report could take overtime.");
    }

    public boolean isLunchTime() {
        return lunchTime;
    }

    public void setLunchTime(boolean lunchTime) {
        this.lunchTime = lunchTime;
    }

    @Override
    public String toString() {
        return "DirectReport: " +
                "lunchTime=" + lunchTime +
                " isMature=" + isMature() +
                " goesToWorkplace=" + isGoesToWorkPlace();
    }
}
