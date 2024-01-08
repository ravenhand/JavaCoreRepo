package task11;

public class Square implements PolygonInterface {
    private int sideA;
    private int sideB;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public Square(){
        System.out.println("Square created");
    }
    @Override
    public int getArea(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
