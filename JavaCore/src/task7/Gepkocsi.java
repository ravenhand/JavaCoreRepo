package task7;

public class Gepkocsi {
    private String manufacturer;
    private String model;
    private String color;
    private int passenger;
    private boolean selfDrive;

    public void acceleration(){
        System.out.println("The car can accelerate.");
    }
    public void stop(){
        System.out.println("The car can stop");
    }
    public void horn(){
        System.out.println("The car can horn");
    }
    public void indicate(){
        System.out.println("The car can indicate");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public boolean isSelfDrive() {
        return selfDrive;
    }

    public void setSelfDrive(boolean selfDrive) {
        this.selfDrive = selfDrive;
    }

    @Override
    public String toString() {
        return "Gepkocsi{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", passenger=" + passenger +
                ", selfDrive=" + selfDrive +
                '}';
    }
}
