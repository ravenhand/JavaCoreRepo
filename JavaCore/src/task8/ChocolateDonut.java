package task8;

public class ChocolateDonut extends ClassicDonut{
    public ChocolateDonut(){
    }
    private int cocoaContain;

    public int getCocoaContain() {
        return cocoaContain;
    }

    public void setCocoaContain(int cocoaContain) {
        this.cocoaContain = cocoaContain;
    }

    public void chocolateMaking(){
        System.out.println("You should make the chocolate for the filling");
    }

    @Override
    public String toString() {
        return "ChocolateDonut{" +
                "cocoaContain=" + cocoaContain +
                '}';
    }
}
