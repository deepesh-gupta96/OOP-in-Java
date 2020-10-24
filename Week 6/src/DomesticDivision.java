public class DomesticDivision extends Division
{
    protected String state;
    public DomesticDivision(String title, int acct, String st)
    {
        super(title,acct);
        state = st;
        // write your code here
    }
    public void display()
    {

        System.out.println("Name: "+this.divisionTitle);
        System.out.println("Account: "+this.acctNum);
        System.out.println("State: "+this.state);
    }
}

