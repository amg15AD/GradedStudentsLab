package gradedStudents;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {

    private String firstname;
    private String lastname;
    private final ArrayList<Double> examScores;

    public Student(String firstname, String lastname, ArrayList<Double> testScores) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.examScores = testScores;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public int getNumOfExamTaken() {
        return examScores.size();
    }

    public String getTheExamScores() {
        String examScore = "";
        int i = 1;
        for (Double s : examScores) {
            examScore += "\tExam " + i++ + " -> " + s + "\n";
        }
        return examScore;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setTheExamScores(int examNumber, double newScore) {
        examScores.add(examNumber, newScore);
    }

    public double getAverageExamScores() {
        double allScores = 0;
        for (Double s : examScores) {
            allScores += s;
        }

        return Math.round(allScores / examScores.size());
    }

    @Override
    public String toString() {
        return "\n\nStudent Name: " + firstname + " " + lastname + "\n" +
                "> Average Score: " + getAverageExamScores() + "\n"
                + "> Exam Scores: \n " + getTheExamScores();
    }


}
