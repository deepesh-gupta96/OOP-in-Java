public abstract class Student {
    private String id;
    private String lastName;
    protected double tuition;
    public Student(String id, String name) {
        this.id = id;
        this.lastName = name;
    }
    public void setId(String idNum) {
       id = idNum;
    }
    public void setLastName(String name) {
        lastName = name;
    }
    public String getId() {
       return id;
    }
    public String getLastName() {
        return lastName;
    }
    public double getTuition() {
        return this.tuition;
    }
    public abstract void setTuition();
}
