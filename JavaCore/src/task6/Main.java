package task6;

import java.util.*;

public class Main {
    static List<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {
        int bookingCount = Integer.parseInt(args[0]);
        Set<Booking> bookingSet = new HashSet<>();
        HashMap<Integer,Booking> bookingMap = new HashMap<>();
        Booking[] bookingArray = new Booking[bookingCount];
        int bookingID = 1000;
        for (int i = 0; i < bookingCount; i++) {

            String name ="";
            String checkInDate = "";
            String checkOutDate = "";
            int numberOfGuests = 0;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Fill the booking field");
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("Phone number: ");
                String phoneNumber = sc.nextLine();
                System.out.println("Check in date: ");
                checkInDate = sc.nextLine();
                System.out.println("Check out date: ");
                checkOutDate = sc.nextLine();
                System.out.println("Number of guests: ");
                numberOfGuests = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("FYI: Somethin went wrong.");
            }
            Booking newBooking = new Booking(name, checkInDate, checkOutDate, numberOfGuests);
            bookingSet.add(newBooking);
            bookingMap.put(bookingID, newBooking);
            bookingID++;
            bookingArray[i] = newBooking;

            if (name.isEmpty()) {
                System.out.println("The name is empty, please add your name.");
                System.exit(1);
            } else if (checkInDate.isEmpty()) {
                System.out.println("The check in date is empty, please add a check in date.");
                System.exit(1);
            } else if (checkOutDate.isEmpty()) {
                System.out.println("The check out date is empty, please add a check out date.");
                System.exit(1);
            } else {
                bookings.add(newBooking);
            }
        }
        System.out.println("----LIST PRINT----");
        System.out.println(bookings);
        System.out.println("----SET PRINT----");
        System.out.println(bookingSet);
        System.out.println("----MAP PRINT----");
        for (Map.Entry mapElement: bookingMap.entrySet()){
            System.out.println("Key: " + mapElement.getKey() + " Value: " + mapElement.getValue());
        }
    }
}
