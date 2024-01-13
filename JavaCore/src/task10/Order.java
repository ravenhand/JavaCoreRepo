package task10;

import java.util.Scanner;

public class Order implements OrderInterface {

    private String productName;
    private int productCount;

    public Order(){
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public void makeOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add the name of the product");
        productName = sc.nextLine();
        System.out.println("Add the quantity of the product");
        productCount = Integer.parseInt(sc.nextLine());
        System.out.println("Cart saved");
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}