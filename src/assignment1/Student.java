package assignment1;

public class Student {
    private String name;
    private double[] score;
    private double average;
    private char grade;

    public Student(String name, double[] score) {
        setName(name);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.length() >= 3 ? name : "Student";
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public double getAverage() {
        setAverage();
        return average;
    }

    public void setAverage() {
        double average = 0;
        //Calculates the average score based on the scores array.
        for (double sc : getScore()) {
            average = average + sc;
        }
        average = average / score.length;
        this.average = average;
    }

    public char getGrade() {
        setGrade();
        return grade;
    }

    //sets the letter grade based on the average score.
    public void setGrade() {
        char grade;
        if (getAverage() >= 90) {
            grade = 'A';
        } else if (getAverage() >= 80) {
            grade = 'B';
        } else if (getAverage() >= 70) {
            grade = 'C';
        } else if (getAverage() >= 60) {
            grade = 'D';
        } else {
            grade = 'f';
        }
        this.grade = grade;
    }
}
