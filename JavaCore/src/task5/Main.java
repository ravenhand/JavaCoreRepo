package task5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the registraion field");
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Birthday: ");
        String birthday = sc.nextLine();
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        System.out.println("Workplace: ");
        String workplace = sc.nextLine();

        Registration newReg = new Registration(email, name, birthday);
        LocalDate birthdayAsDate = null;

        if (!(phone.isEmpty())){
            newReg.setPhone(phone);
        }
        if (!(workplace.isEmpty())){
            newReg.setWorkplace(workplace);
        }
        try {
            birthdayAsDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        } catch (Exception e){
            System.out.println("Date is not valid");
            System.exit(1);
        }

        if (email.isEmpty() || name.isEmpty()) {
            System.out.println(newReg);
            System.out.println("The email and name must not be empty!");
        }else{
            System.out.println(newReg);
        }
    }
}

