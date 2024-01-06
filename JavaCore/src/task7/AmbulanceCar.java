package task7;

public class AmbulanceCar extends Gepkocsi {
    private boolean specificSignal;

    public AmbulanceCar(){
        super();
    }

    public boolean isSpecificSignal() {
        return specificSignal;
    }

    public void setSpecificSignal(boolean specificSignal) {
        this.specificSignal = specificSignal;
    }

    public void siren(){
        System.out.println("The ambulance car can use siren.");
    }
    public void enterTheHospital(){
        System.out.println("The ambulance car can go to the Hospital");
    }
    @Override
    public String toString() {
        return "The AmbulanceCar: " + "has a specific signal" +
        ", manufacturer: " + getManufacturer() +
                ", model: " + getModel() +
                ", color: " + getColor() +
                ", passenger: " + getPassenger() +
                ", self drive: " + isSelfDrive();
    }
}
