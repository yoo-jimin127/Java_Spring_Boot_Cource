package dev.jiminyoo.controllerdemo;

public class SamplePlayload {
    private String name;
    private int age;
    private String Occupation;

    public SamplePlayload() {

    }

    public SamplePlayload(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        Occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    @Override
    public String toString() {
        return "SamplePlayload{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Occupation='" + Occupation + '\'' +
                '}';
    }
}
