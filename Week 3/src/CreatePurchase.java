import java.util.*;
public class CreatePurchase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Purchase purch = new Purchase();
        int num;
        double amount;
        String entry;
        final int LOW = 1000, HIGH = 8000;
        System.out.println("Enter invoice number");
        entry = input.next();
        num = Integer.parseInt(entry);
        while(num <= LOW || num >= HIGH)
        {
            System.out.println("Invoice number must be between " +
                    LOW + " and " + HIGH + "\nEnter invoice number");
            entry = input.next();
            num = Integer.parseInt(entry);
        }

        System.out.println("Enter sale amount");
        entry = input.next();
        amount = Double.parseDouble(entry);
        while(amount < 0)
        {
            System.out.println("Enter sale amount");
            entry = input.next();
            amount = Double.parseDouble(entry);
        }
        purch.setInvoiceNumber(num);
        purch.setSaleAmount(amount);
        purch.display();
    }
}
