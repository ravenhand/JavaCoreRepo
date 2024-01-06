package task9;

public class Employee {
    private boolean isMature;

    private boolean goesToWorkPlace;

    public void takesPayCheck(){
        System.out.println("The employee takes pay check for the work");
    }

    public boolean isMature() {
        return isMature;
    }

    public void setMature(boolean mature) {
        isMature = mature;
    }

    public boolean isGoesToWorkPlace() {
        return goesToWorkPlace;
    }

    public void setGoesToWorkPlace(boolean goesToWorkPlace) {
        this.goesToWorkPlace = goesToWorkPlace;
    }
}
