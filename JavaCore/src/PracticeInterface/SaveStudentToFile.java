package PracticeInterface;

public class SaveStudentToFile implements StudentSaver {
    @Override
    public void save(Student student){
        System.out.println("Student save to file");
    }
    public String getHello(){
        return "Hello";
    }
}
