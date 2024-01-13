package task16;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        DogRegister dogRegister = new DogRegister();
        dogRegister.readCSVFile();
        System.out.println(dogRegister.getDogs());
        System.out.println(dogRegister.getDogs().size());
        List<AbstractDog> dogsWeRead = dogRegister.getDogs();
        System.out.println(dogsWeRead);
        System.out.println(dogsWeRead.getClass());
    }
}
