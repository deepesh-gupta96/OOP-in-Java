public class Rock {
     int sampleNumber;
     String description;
    double  weight;
    final String DEFAULTDESCRIPTION = "Unclassified";

    public Rock(int sampleNumber, double weight){
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        this.description = DEFAULTDESCRIPTION;
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
