package gradedStudents;

import java.util.*;

public class Classroom {
    private final Student[] students;

    public Classroom(int maxNumStudent) {
        this.students = new Student[maxNumStudent];
    }

    public Classroom(Student[] students) {
        this.students = students;
        for (Student s : students) {
            if (s != null) {
            }
        }

    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {

        return students;
    }

    public double getAverageExamScore() {
        double roomsAverage = 0;
        for (Student s : students) {
            roomsAverage += s.getAverageExamScores();
        }
        return roomsAverage / students.length;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void removeStudents(String firstName, String lastName) {
        Student studentHolder;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstname().equalsIgnoreCase(firstName) && students[i].getLastname().equalsIgnoreCase(lastName)) {
                students[i] = null;
                break;
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null && i != students.length - 1 && students[i + 1] != null) {
                studentHolder = students[i];
                students[i] = students[i + 1];
                students[i + 1] = studentHolder;

            }
        }
    }

    public Student[] getStudentsByScore() {
        Student[] students = this.students;
        Student currentStudent;
        if (students.length == 1) {
            return students;
        }
        while (true) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    break;
                }
                if (i != students.length - 1 && students[i + 1] != null && students[i].getAverageExamScores() < students[i + 1].getAverageExamScores()) {
                    currentStudent = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = currentStudent;
                }
            }
            int count = 0;
            for (int y = count + 1; y < students.length; y++) {
                if (students[y] != null && students[count].getAverageExamScores() < students[y].getAverageExamScores()) {
                    break;
                }
                if (y == students.length - 1 && students[y] == null || y == students.length - 1 && students[count].getAverageExamScores() > students[y].getAverageExamScores()) {
                    return students;
                }
                count++;
            }
        }
    }


    public Map<Student, Character> getGradeBook() {

        Student[] studentRankings = getStudentsByScore();
        Map<Student, Character> gradeBook = new HashMap<>();
        double classHighestGrade = studentRankings[0].getAverageExamScores();
        double studentPercentage = 0;
        char grade;
        for (int i = 0; i < studentRankings.length; i++){
            if(studentRankings[i] != null) {
                studentPercentage = (studentRankings[i].getAverageExamScores() / classHighestGrade) * 100;
            }
            if(studentRankings[i] == null){
                continue;
            }
            if(studentPercentage >= 90){
                grade = 'A';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 90 && studentPercentage >= 71) {
                grade = 'B';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 71 && studentPercentage >= 50) {
                grade = 'C';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 50 && studentPercentage >= 11) {
                grade = 'D';
                gradeBook.put(studentRankings[i], grade);
            }
            if (studentPercentage < 11) {
                grade = 'F';
                gradeBook.put(studentRankings[i], grade);
            }
        }

        return gradeBook;
    }

}