package task13;

public class FerrariPilotOne implements Car, Racer{
    private String carManufacturer;
    private String racerName;
    private String nationality;
    @Override
    public void acceleration(double timeTo100) {
    }

    @Override
    public String getCarManufacturer() {
        return carManufacturer;
    }

    @Override
    public String getRacerName() {
        return racerName;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public void setRacerName(String racerName) {
        this.racerName = racerName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "FerrariPilotOne{" +
                "carManufacturer='" + carManufacturer + '\'' +
                ", racerName='" + racerName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
