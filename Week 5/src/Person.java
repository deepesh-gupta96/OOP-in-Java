import java.util.*;
public class Person
{
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;


    Scanner sc = new Scanner(System.in);

   /* public Person(String firstName, String lastName, String address, String zip, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zip = zip;
        this.phone = phone;
    }*/

    public void setData() {
        System.out.println("Enter the first name: ");
        firstName = sc.nextLine();

        System.out.println("Enter the last name: ");
        lastName = sc.nextLine();

        System.out.println("Enter address: ");
        address = sc.nextLine();

        System.out.println("Enter zip code: ");
        zip = sc.nextLine();

        System.out.println("Enter the phone number: ");
        phone = sc.nextLine();

    }
    public void display() {

        System.out.println(firstName+" "+lastName+" "+address+" "+zip+" "+phone);

    }
}
