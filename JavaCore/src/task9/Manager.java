package task9;

public class Manager extends Employee{
    public Manager(){
        super();
    }
    private boolean hasACompanyCar;

    public void setTakesResponsibility(){
        System.out.println("The manager takes responsibility for the workers.");
    }

    public boolean isHasACompanyCar() {
        return hasACompanyCar;
    }

    public void setHasACompanyCar(boolean hasACompanyCar) {
        this.hasACompanyCar = hasACompanyCar;
    }

    @Override
    public String toString() {
        return "Manager: " +
                "hasACompanyCar=" + hasACompanyCar +
                " isMature=" + isMature() +
                " goesToWorkplace=" + isGoesToWorkPlace();
    }
}
