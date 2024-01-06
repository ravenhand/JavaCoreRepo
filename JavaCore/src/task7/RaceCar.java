package task7;

public class RaceCar extends Gepkocsi {

    private boolean hasExtraBody;
    private boolean hasExtraFireSystem;
    public RaceCar(){
        super();
    }

    public boolean isHasExtraBody() {
        return hasExtraBody;
    }

    public void setHasExtraBody(boolean hasExtraBody) {
        this.hasExtraBody = hasExtraBody;
    }

    public boolean isHasExtraFireSystem() {
        return hasExtraFireSystem;
    }

    public void setHasExtraFireSystem(boolean hasExtraFireSystem) {
        this.hasExtraFireSystem = hasExtraFireSystem;
    }

    public void racing(){
        System.out.println("The race car can race");
    }
    @Override
    public String toString() {
        return "RaceCar: " +
                "hasExtraBody=" + hasExtraBody +
                ", hasExtraFireSystem=" + hasExtraFireSystem +
                ", manufacturer: " + getManufacturer() +
                ", model: " + getModel() +
                ", color: " + getColor() +
                ", passenger: " + getPassenger() +
                ", self drive: " + isSelfDrive();
    }
}

