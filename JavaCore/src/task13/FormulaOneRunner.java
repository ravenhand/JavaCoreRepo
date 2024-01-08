package task13;

public class FormulaOneRunner {
    public static void main(String[] args) {
        MercedesPilotOne racerOne = new MercedesPilotOne();
        racerOne.setNationality("english");
        racerOne.setRacerName("Lewis Hamilton");
        racerOne.setCarManufacturer("mercedes");
        racerOne.acceleration(2.1);

        FerrariPilotOne racerTwo = new FerrariPilotOne();
        racerTwo.setNationality("moroccan");
        racerTwo.setRacerName("Charles Leclers");
        racerTwo.setCarManufacturer("ferrari");
        racerTwo.acceleration(2.4);

        System.out.println(racerOne);
        System.out.println(racerTwo);
    }
}
