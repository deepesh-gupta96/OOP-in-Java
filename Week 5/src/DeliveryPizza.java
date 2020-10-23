public class DeliveryPizza extends Pizza {
    public double getDeliveryFee() {
        if (price>15){
            return deliveryFee = getPrice()+3.0;
        }
        else
            return deliveryFee = getPrice()+5.0;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    double deliveryFee;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;


    public DeliveryPizza(String des, double price, String add) {
        super(des, price);
        address = add;
        if (price>15){
            deliveryFee = 3.0;
        }
        else
            deliveryFee = 5.0;
    }

    public void display(){
        System.out.println( getDescription()+" pizza Price:$ "+(price+deliveryFee)+ " and the delivery address is "+address);
    }
}
