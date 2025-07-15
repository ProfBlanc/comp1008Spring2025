package wk9;

public class Tiger extends Animal {

    private String gender;
    private double tall;

    public Tiger() {
        super();
    }

    public Tiger(String name, int age, double weight, String gender, double tall) {
        super(name, age, weight);
        this.gender = gender;
        this.tall = tall;
    }


    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "gender='" + gender + '\'' +
                ", tall=" + tall +
                ", name='" + name + '\'' +
                "Age=" + getAge() +
                ", weight=" + weight +
                '}';
    }
}
