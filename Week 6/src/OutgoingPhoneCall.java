public class OutgoingPhoneCall extends PhoneCall
{
    public final static double RATE = .04;
    private int minutes;
    public OutgoingPhoneCall(String num, int mins)
    {
       super(num);
       this.minutes = mins;
       this.price = RATE;
    }
    public void getInfo()
    {
        System.out.println("Number:"+this.phoneNumber);
        System.out.println("Price: "+RATE);
        System.out.println("Time: "+minutes);
        System.out.println("Total: "+price*minutes);
    }
    public String getPhoneNumber()
    {
       return phoneNumber;
    }
    public double getPrice()
    {
       return price;
    }
}
