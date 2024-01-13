package PracticeInterface;

public class Main {
    public static void main(String[] args) {
        SaveStudentToConsole saveStudentToConsole = new SaveStudentToConsole();
        SaveStudentToFile saveStudentToFile = new SaveStudentToFile();
        Student student1 = new Student("Kiss Ádám", "11C");
        saveStudentToConsole.save(student1);
        saveStudentToFile.save(student1);
    }
}