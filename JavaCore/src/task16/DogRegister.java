package task16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DogRegister {
    private List<AbstractDog> dogs = new ArrayList<>();

    void readCSVFile()  {
        List<String> fileContent = null;
        try {
            fileContent = Files.readAllLines(Path.of("JavaCore/resources/dogs.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String row: fileContent){
            String[] rowData = row.split(", ");
            String type = rowData[0];
            String name = rowData[1];
            String gender = rowData[2];
            String birthDay = rowData[3];
            String weight = rowData[4];
            String additionalProperties = rowData[5];

            if (type.equals("Bulldog")){
                dogs.add(new Bulldog(type, name, gender, birthDay, weight, additionalProperties));
            }else if (type.equals("YorkshireTerrier")){
                dogs.add(new YorkshireTerrier(type, name, gender, birthDay, weight, additionalProperties));
            } else if (type.equals("CaucasianShepard")) {
                dogs.add(new CaucasianShepard(type, name, gender, birthDay, weight, additionalProperties));
            } else {
                System.out.println("Wrong type");
            }
        }
    }
    public List<AbstractDog> getDogs(){
        return dogs;
    }
}
