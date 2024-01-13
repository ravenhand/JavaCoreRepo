package PracticeInterface;

public class Student {
    private String name;
    private String birthDay;
    private String classId;

    public Student(String name, String classId) {
        this.name = name;
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getClassId() {
        return classId;
    }
}