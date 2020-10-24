public abstract class Book
{
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    String title;
    double price;

    public Book(String title, double price){
        this.title = title;
        price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }






}
