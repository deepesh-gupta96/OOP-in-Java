import java.util.Scanner;

public class PurchaseArray {
    public static void main(String[] args) {
        Purchase[] purchasesArray = new Purchase[5];
        Scanner sc = new Scanner(System.in);
        int i, invoiceNumber;
        double salesAmount;
        for(i = 0;i < purchasesArray.length;++i){
            purchasesArray[i] = new Purchase();
            do{
                System.out.println("Please enter an invoice number: ");
                invoiceNumber = sc.nextInt();
                sc  .nextLine();
            }while(!(invoiceNumber >= 1000) || !(invoiceNumber <= 8000));
            purchasesArray[i].setInvoiceNumber(invoiceNumber);
            do{
                System.out.println("Please enter a sale amount:");
                salesAmount = sc.nextDouble();
                sc.nextLine();
            }while(salesAmount < 0);
            purchasesArray[i].setSaleAmount(salesAmount);
        }
        for(i = 0;i < purchasesArray.length;++i)
            purchasesArray[i].display();
    }
}
