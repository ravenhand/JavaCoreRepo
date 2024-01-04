package task2;

import task2.Auto;

public class Exercise2 {
    public static void main(String[] args) {
        Auto yaris = new Auto();
        yaris.setManufacturer("Toyota");
        yaris.setModel("Yaris");
        yaris.setYear(2020);
        yaris.setDoors(5);
        yaris.setColour("Kolbászzsírmetál");

        Auto AlfaGT = new Auto();
        AlfaGT.setManufacturer("Alfa Romeo");
        AlfaGT.setModel("GT");
        AlfaGT.setYear(2006);
        AlfaGT.setDoors(3);
        AlfaGT.setColour("Fekete");

        Auto Scania = new Auto();
        Scania.setManufacturer("Scania");
        Scania.setModel("R500 super");
        Scania.setYear(2021);
        Scania.setDoors(2);
        Scania.setColour("tűzpiros");

        System.out.println(yaris);
        System.out.println(AlfaGT);
        System.out.println(Scania);
    }
}
