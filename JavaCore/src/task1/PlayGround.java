package task1;

import task1.Car;

public class PlayGround {
    public static void main(String[] args) {
        Car ferrari = new Car("","");
        Car fiat = new Car();
        Car kia = new Car();
        Car honda = new Car();
        Car mercedes = new Car("","");

        int hp;
        hp = 500;

        ferrari.setColour("red");
        ferrari.setModel("GT1000");

        honda.setColour("silver");
        honda.setModel("NSX");
        System.out.println(honda.getModel());
        System.out.println(honda.getValues());
        System.out.println(ferrari.getValues());
    }
}
