package task7;

public class Main {
    public static void main(String[] args) {
        Gepkocsi myCar = new Gepkocsi();
        myCar.acceleration();

        AmbulanceCar ambulanceCar = new AmbulanceCar();
        System.out.println(ambulanceCar);

        RaceCar raceCar = new RaceCar();
        System.out.println(raceCar);
    }
}
