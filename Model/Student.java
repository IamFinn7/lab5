package Model;

public class Student {
    String ID, name;
    float average;

    public Student() {
    }

    public Student(String ID, String name, float average) {
        this.ID = ID;
        this.name = name;
        this.average = average;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAverage() {
        return average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "ID = " + ID + ", Name = " + name + ", Average = " + average;
    }
    
}
