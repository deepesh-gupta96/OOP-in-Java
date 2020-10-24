public class UndergraduateStudent extends Student
{
    public static final double UNDERGRAD_TUITION = 4000;
    public UndergraduateStudent(String id, String name) {
        super(id, name);
        super.tuition = UNDERGRAD_TUITION;
    }
    public void setTuition()
    {
        tuition = UNDERGRAD_TUITION;
    }
}
