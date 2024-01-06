package task6;

public class Booking {
    private String name;
    private String phoneNumber;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;

    public Booking(String name, String checkInDate, String checkOutDate, int numberOfGuests) {
        this.name = name;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + System.lineSeparator() +
                "Phone number: " + phoneNumber + System.lineSeparator() +
                "Check in date: " + checkInDate + System.lineSeparator() +
                "Check out date: " + checkOutDate + System.lineSeparator() +
                "Number of guests: " + numberOfGuests;
    }
}
