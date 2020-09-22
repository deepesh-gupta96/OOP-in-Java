/**Create a class named Billing that includes three overloaded computeBill() methods for a photo book store.
 * • When computeBill() receives a single parameter, it represents the price of one photo book ordered.
 * Add 8% tax, and return the total due.
 *
 * •When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered.
 * Multiply the two values, add 8% tax, and return the total due.
 *
 * •When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value.
 * Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due.*/


public class Billing {
    final static double TAX = 0.08;
    public static void main(String[] args) {
        final double HIGHPRICE = 24.99;
        final double MEDPRICE = 17.50;
        final double LOPRICE = 10.00;
        final int QUAN1 = 4;
        final int QUAN2 = 6;
        double bill;

        bill = computeBill(HIGHPRICE);
        System.out.println("The total for a photobook that costs $" + HIGHPRICE + " is $" + bill);

        bill = computeBill(MEDPRICE, QUAN1);
        System.out.println("The total for " + QUAN1 + " photobooks that cost $" +  MEDPRICE + " is $" + bill);

        bill = computeBill(LOPRICE, QUAN2, 20.00);
        System.out.println("The total for " + QUAN2 + " photobooks that cost $" +  LOPRICE + " with a $20 coupon is $" + bill);
    }

    public static double computeBill(double amt) {
        double bill = (amt * TAX) + amt;
        return bill;
    }

    public static double computeBill(double amt, int quantity) {
        double a = (amt * quantity);
        double bill = (a*TAX) + a;
        return bill;
    }
    public static double computeBill(double amt, int quantity, double coupon) {

            double a = ((amt*quantity)-coupon);
            double bill = (a*TAX) + a;
        return bill;
    }
}
/*public class Billing {
    final static double TAX = 0.08;
    public static void main(String[] args) {
        final double HIGHPRICE = 24.99;
        final double MEDPRICE = 17.50;
        final double LOPRICE = 10.00;
        final int QUAN1 = 4;
        final int QUAN2 = 6;
        double bill;
        bill = computeBill(HIGHPRICE);
        System.out.println("The total for a photobook that costs $" +
                           HIGHPRICE + " is $" + bill);
        bill = computeBill(MEDPRICE, QUAN1);
        System.out.println("The total for " + QUAN1 +
                           " photobooks that cost $" +
                           MEDPRICE + " is $" + bill);
        bill = computeBill(LOPRICE, QUAN2, 20.00);
        System.out.println("The total for " + QUAN2 +
                           " photobooks that cost $" +
                           LOPRICE + " with a $20 coupon is $" + bill);
    }

    public static double computeBill(double amt) {
        // Write your code here
    }

    public static double computeBill(double amt, int quantity) {
        // Write your code here
    }
    public static double computeBill(double amt, int quantity, double coupon) {
        // Write your code here
    }
}
*/