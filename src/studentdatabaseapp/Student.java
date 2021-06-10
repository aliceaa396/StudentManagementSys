package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int studentYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 500;
    private static int id = 1000;

    //Constructor prompts user for Student Full Name and Year
    public Student(){
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student Last Name: ");
        this.lastName = in.nextLine();
        System.out.println("==================");

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student Year: ");
        this.studentYear = in.nextInt();
        setStudentId();
        System.out.println("==================");
    }


    //Generate 5 digit Student Id every time a new student is created with the first number being the year they are
    private void setStudentId(){
        //Grade level + staticId
        id++;
        this.studentId =  studentYear + "" + id;
    }


    //Enroll Student in Courses
    public void enroll(){
        //Go into loop and allow user to hit 0 when finished enrolling
        //Need to increase tuition balance with each class you enroll in

        do {
            System.out.print("Enter course to enroll(Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
            }
        } while (1 != 0);
    }


    //View Balance
    public void viewBalance(){
        System.out.println("Your tuition balance is: $" + tuitionBalance + ".");
    }

    // Pay Tuition
    public void payTuition(){
        System.out.println("==================");
        viewBalance();
        System.out.print("Enter payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.print("Thank you for your payment of: $" + payment + ", ");
        viewBalance();
        System.out.println("==================");
    }

    //Show status of the student
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + studentYear +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled in: " + courses +
                "\nTuition Balance: $" + tuitionBalance +
                "\n==================";

    }
}
