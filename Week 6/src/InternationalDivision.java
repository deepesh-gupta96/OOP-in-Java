public class InternationalDivision extends Division
{
    protected String country;
    protected String language;
    public InternationalDivision(String title, int acct, String cty, String lang)
    {
        super(title,acct);
        country = cty;
        language = lang;
    }
    public void display() {
        System.out.println("Name: "+this.divisionTitle);
        System.out.println("Account: "+this.acctNum);
        System.out.println("Country: "+this.country);
        System.out.println("Language: "+this.language);

    }
}

