public class StudentAtLarge extends Student {
    public static final double SAL_TUITION = 2000;
    public StudentAtLarge (String id, String name) {
        super(id, name);
        super.tuition = SAL_TUITION;

    }
    public void setTuition() {
        tuition = SAL_TUITION;
    }
}
