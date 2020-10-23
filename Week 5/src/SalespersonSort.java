import java.util.Scanner;

public class SalespersonSort {
    public static void main(String[] args) {
        Salesperson[] salespeopleArray = new Salesperson[7];
        int a, b;
        Scanner sc = new Scanner(System.in);
        Salesperson temp;
        int enteredId;
        double enteredAmount;
        String choice;
        for(a = 0;a < salespeopleArray.length;++a){
            if(salespeopleArray[a] == null){
                System.out.print("Enter the ID for salesperson #"+(a+1)+":");
                enteredId = sc.nextInt();
                sc.nextLine();
                System.out.print("Next, enter the annual sales amount for employee #"+(a+1)+":");
                enteredAmount = sc.nextDouble();
                sc.nextLine();
                salespeopleArray[a] = new Salesperson(enteredId, enteredAmount);
            }
        }
        //System.out.println("Here's the salespeople as you entered them:");
        //display(salespeopleArray, 0);
        System.out.println("Would you like to sort the list by ID or Sales Value? ");
        choice = sc.nextLine();
        a = 1;
        switch(choice.toUpperCase()){
            case "I":
                while(a < salespeopleArray.length){
                    temp = salespeopleArray[a];
                    b = a - 1;
                    while(b >= 0 && salespeopleArray[b].getId() > salespeopleArray[b+1].getId()){
                        salespeopleArray[b+1] = salespeopleArray[b];
                        --b;
                    }
                    salespeopleArray[b+1] = temp;
                    display(salespeopleArray, a);
                    ++a;
                }
                break;
            case "S":
                while(a < salespeopleArray.length){
                    temp = salespeopleArray[a];
                    b = a - 1;
                    while(b >= 0 && salespeopleArray[b].getSales() > temp.getSales())
                    {
                        salespeopleArray[b+1] = salespeopleArray[b];
                        --b;
                    }
                    salespeopleArray[b+1] = temp;
                    display(salespeopleArray, a);
                    ++a;
                }
                break;
            default:
                System.out.println("Sorry but you didn't specify correctly.");
                break;
        }
    }
    public static void display(Salesperson[] salespeopleArray, int iterations){
        System.out.println("Iteration #"+iterations+":");
        for(int x = 0;x < salespeopleArray.length;++x)
            System.out.println("Salesperson #"+(x+1)+"'s ID: "+salespeopleArray[x].getId()+ " Sales Value: "+salespeopleArray[x].getSales());
        System.out.println();
    }
}