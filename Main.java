package gradedStudents;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //double[] s1ExamScores = {92.0,94.0,88.0,96.0};
        ArrayList<Double> s1ExamScores = new ArrayList<>(); // Student 1
        s1ExamScores.add(92.0);
        s1ExamScores.add(86.0);
        s1ExamScores.add(89.0);
        s1ExamScores.add(95.0);

        Student s1 = new Student("Remy","Rodnyson",s1ExamScores);
        String s1FullName = s1.getFirstname() + " " + s1.getLastname();
//
//        System.out.println(s1.getTheExamScores());
//        System.out.println("Number of test taken - " + s1.getNumOfExamTaken());
//        System.out.println("=======");
//        s1.addExamScore(88.0);
//        System.out.println(s1.getExamScores());
//        System.out.println(s1.getTheExamScores());
//        System.out.println("=======");
//        s1.setTheExamScores(2,100);
//        System.out.println(s1.getTheExamScores());
//        System.out.println(s1FullName+ " average score is : "+ s1.getAverageExamScores());
//        System.out.println(s1.toString());

        ArrayList<Double> s2ExamScores = new ArrayList<>(); // Student 2
        s2ExamScores.add(99.0);
        s2ExamScores.add(96.0);
        s2ExamScores.add(95.0);
        s2ExamScores.add(100.0);
        Student s2 = new Student("Mike","Sully",s2ExamScores);
        String s2FullName = s2.getFirstname() + " " + s2.getLastname();

        ArrayList<Double> s3ExamScores = new ArrayList<>(); // Student 3
        s3ExamScores.add(99.0);
        s3ExamScores.add(96.0);
        s3ExamScores.add(95.0);
        s3ExamScores.add(100.0);
        Student s3 = new Student("Manny","Smith",s3ExamScores);
        String s3FullName = s3.getFirstname() + " " + s3.getLastname();

        ArrayList<Double> s4ExamScores = new ArrayList<>(); // Student 4
        s4ExamScores.add(80.0);
        s4ExamScores.add(86.0);
        s4ExamScores.add(85.0);
        s4ExamScores.add(96.0);
        Student s4 = new Student("Rocky","Robinson",s4ExamScores);
        String s4FullName = s4.getFirstname() + " " + s4.getLastname();


//        Student [] students = { s1,s2,s3,s4};
//        Classroom scienceClass = new Classroom(students);// first classroom
//        System.out.println(Arrays.toString(scienceClass.getStudents()));
//        scienceClass.removeStudents("mike","sully");
//        System.out.println("============");
//        System.out.println(Arrays.toString(scienceClass.getStudents()));


        Classroom classroom = new Classroom();
        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);
        classroom.addStudent(s4);

        System.out.println(Arrays.toString(classroom.getStudentsByScore()));

//        System.out.println(Arrays.toString(classroom.getStudents()));


//        Student[] preEnrollment = classroom.getStudents();
//       // classroom.addStudent(s3);
//        Student[] postEnrollment = classroom.getStudents();


//        System.out.println("===========================");
//        System.out.println(preEnrollment[0]);
////        System.out.println("===========================");
//        System.out.println(postEnrollment[0]);
//        classroom.addStudent(s1);
//        Student[] latestPostEnrollment = classroom.getStudents();
////        String latestPostEnrollmentAsString = Arrays.toString(latestPostEnrollment);
////        System.out.println(latestPostEnrollmentAsString);



    }








}//end if main method
