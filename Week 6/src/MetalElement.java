public class MetalElement extends Element
{
    public MetalElement(String s, int an, double aw)
    {
        super(s,an,aw);
    }
    public void describeElement()
    {
        System.out.println("Most elements can be considered metals." +
                " They are grouped together in the middle to the left-hand side of the periodic table. " +
                "The metals consist of the alkali metals, alkaline earths, transition metals, lanthanides, and actinides.");

        System.out.println("Symbol: "+this.symbol);
        System.out.println("Atomic number: "+this.atomicNumber);
        System.out.println("Atomic weight: "+super.atomicWeight);
    }
}
