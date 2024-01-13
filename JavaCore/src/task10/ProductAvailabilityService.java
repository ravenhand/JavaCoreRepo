package task10;

import java.util.Random;

public class ProductAvailabilityService {
    public boolean getAvailability(){
        boolean isAvailable = false;
        Random random = new Random();
        int result = random.nextInt(4); // 0,1
        switch (result){
            case 0:
                isAvailable = false;
                break;
            default:
                isAvailable = true;
        }
        return isAvailable;
    }
}
