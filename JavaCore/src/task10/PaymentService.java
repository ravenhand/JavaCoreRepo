package task10;

import java.util.Random;

public class PaymentService {
    // Számolja ki a fizetendő összeget.
    public String currency = "Ft";
    public int getPrice(){
        Random random = new Random();
        int price = random.nextInt(1000,10000);
        return price;
    }
}
