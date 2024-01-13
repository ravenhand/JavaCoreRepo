package task16;

public class AbstractDog {
    protected String type;
    protected String name;
    protected String gender;
    protected String birthDay;
    protected String weight;
    protected String additionalProperties;

    @Override
    public String toString() {
        return "AbstractDog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public AbstractDog(String type, String name, String gender, String birthDay, String weight, String additionalProperties) {
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.weight = weight;
        this.additionalProperties = additionalProperties;
    }
}
