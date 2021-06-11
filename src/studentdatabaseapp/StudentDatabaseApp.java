package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask user how many students we want to add

        System.out.println("Enter Number of Students to EnrollL: ");
        Scanner in = new Scanner(System.in);

        //Create an Arr of Objs w/ students
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Loop to create the number of students passed in
        for(int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}
