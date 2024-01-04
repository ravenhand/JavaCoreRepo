package task5;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    private String email;
    private String name;
    private String birthday;
    private String phone;
    private String workplace;

    public Registration(String email, String name, String birthday) {
        this.email = email;
        this.name = name;
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public String toString() {
        return
                "Email: " + email + System.lineSeparator()+
                "Name: " + name + System.lineSeparator()+
                "Birthday: " + birthday + System.lineSeparator()+
                "Phone: " + "+"+phone + System.lineSeparator()+
                "Workplace: " + workplace + System.lineSeparator();
    }
}

