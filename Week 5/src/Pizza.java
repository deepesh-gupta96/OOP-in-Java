public class Pizza {
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;
    String output;

    public Pizza(String des, double price) {
        this.description = des;
        this.price = price;
    }

    public void display(){
        System.out.println(description+" pizza   Price: $" +price);

    }
}
