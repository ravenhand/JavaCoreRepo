package PracticeInterface;

public class SaveStudentToConsole implements StudentSaver {
    @Override
    public void save(Student student) {
        System.out.println("Student" + student);
    }
}
