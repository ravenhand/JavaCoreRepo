package task11;

public class PolygonRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        int area = rectangle1.getArea(2, 3);
        System.out.println(rectangle1 + " ,Area: " + area);

        Square square1 = new Square();
        int areaSquare = square1.getArea(3, 3);
        System.out.println(square1 + " ,Area: " + areaSquare);
    }
}
