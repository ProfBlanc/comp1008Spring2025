package wk9;

public class Animal {
    private int age;
    public String name;
    protected double weight;

    public Animal() {
    }

    public Animal(String name, int age, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
