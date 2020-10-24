public class IncomingPhoneCall extends PhoneCall
{
    public final static double RATE = .02;

    public IncomingPhoneCall(String num){
        super(num);
        this.price = RATE;

    }

    public String getPhoneNumber() {
        return this.phoneNumber;

    }
    public double getPrice() {
        return this.price;
    }

    public void getInfo()
    {
        System.out.println("Number:"+this.phoneNumber+" Price:"+this.price);
    }
}
