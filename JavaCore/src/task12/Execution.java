package task12;

public class Execution {
    public static void main(String[] args) {
        SemiFinal semiFinal = new SemiFinal();
        semiFinal.setHomeTeam("Franciaország");
        semiFinal.setAwayTeam("Marokkó");
        semiFinal.setEventName();
        semiFinal.setLocation("Puskás Aréna");
        semiFinal.setSportType("labdarúgás");

        System.out.println(semiFinal);
    }
}
