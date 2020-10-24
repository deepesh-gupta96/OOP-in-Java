public class OnlineNewspaperSubscription extends NewspaperSubscription{
    public void setAddress(String address) {
        rate = 0;
        //the condition for the email
        if (address.contains("@"))
        {
            this.address = address;
            //charging the rate
            rate +=9;

        }
        //if there is a bad input
        else
            System.out.println(",used invalid input for address, subscription rate is $0");
    }
}