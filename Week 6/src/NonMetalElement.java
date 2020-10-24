public class NonMetalElement extends Element
{
    public NonMetalElement(String s, int an, double aw)
    {
        super(s,an,aw);
    }
    public void describeElement()
    {
        System.out.println("The nonmetal elements occupy the upper right-hand corner of the periodic table. " +
                "These elements have similar chemical properties that differ from the elements considered metals.\n" +
                "\n" +
                "The nonmetal element group is a subset of these elements. " +
                "The nonmetal element group consists of hydrogen, carbon, nitrogen, oxygen, phosphorus, sulfur and selenium.\n" +
                "\n" +
                "Hydrogen acts as a nonmetal at normal temperatures and pressure and is " +
                "generally accepted to be part of the nonmetal group.");

        System.out.println("Symbol: "+this.symbol);
        System.out.println("Atomic number: "+this.atomicNumber);
        System.out.println("Atomic weight: "+super.atomicWeight);

    }
}
