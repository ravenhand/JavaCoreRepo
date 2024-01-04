package task1;

public class Car {
    private String model;
    private String colour;

    public Car(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }
    public Car(){

    }

    public void setModel(String newmodel) {
      model = newmodel;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public String getValues() {
        return "Model: " + model + " Colour: " + colour;
    }
}
