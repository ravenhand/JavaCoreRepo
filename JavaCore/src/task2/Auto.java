package task2;

public class Auto {
    private String manufacturer;
    private String model;
    private int year;
    private int doors;
    private String colour;

    public Auto(){

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                ", colour='" + colour + '\'' +
                '}';
    }
}
