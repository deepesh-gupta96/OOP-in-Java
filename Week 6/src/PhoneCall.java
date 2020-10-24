public abstract class PhoneCall
{
    String phoneNumber;
    double price;
    public PhoneCall(String num)
    {
        this.phoneNumber = num;
        price = 0;
    }

    public void setPrice(double pr)
    {
        this.price = price;
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}
