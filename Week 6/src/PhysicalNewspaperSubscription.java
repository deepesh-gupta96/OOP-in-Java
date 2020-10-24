public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    public void setAddress(String address)
    {

        rate = 0;
        //checks the address
        if (address.contains("1") || address.contains("2") || address.contains("3") ||
                address.contains("4") || address.contains("5") ||
                address.contains("6") || address.contains("7") ||
                address.contains("8") || address.contains("9") || address.contains("0")){
            this.address = address;
            //charges rate
            rate +=15.0;
            //System.out.print(", " + address + ", ");

        }
        //if invalid input
        else
            System.out.println(" Invalid input for address, subscription rate is $0");

    }

}

