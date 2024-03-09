package player;
import java.util.Scanner;

public class Player {
    String name;
    String contactNo;
    String email;
    String address;
    int age;

    public void setPlayerDetails(String name, String contactNo, String email, String address, int age) {
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public void getPlayerDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("Contact No: " + contactNo);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public String getPlayerName() {
        return name;
    }

    public Player setPlayerDetailsFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Contact No: ");
        String contactNo = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        setPlayerDetails(name, contactNo, email, address, age);
        return this;
    }
}
