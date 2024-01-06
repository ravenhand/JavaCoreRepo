package task8;

public class JamDonut extends ClassicDonut{
    public JamDonut(){
    }
    private int fruitContain;

    public int getFruitContain() {
        return fruitContain;
    }

    public void setFruitContain(int fruitContain) {
        this.fruitContain = fruitContain;
    }

    public void jamMaking(){
        System.out.println("You should make the jam for the filling");
    }

    @Override
    public String toString() {
        return "JamDonut{" +
                "fruitContain=" + fruitContain +
                '}';
    }
}
