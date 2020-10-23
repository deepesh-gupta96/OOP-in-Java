public class DemoPizzas {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("asv", 20.99);
        p1.display();

        Pizza pd = new DeliveryPizza(p1.getDescription(), p1.getPrice(),"asd");
        pd.display();


    }
}
