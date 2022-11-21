import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class StudentBehavior extends Student {
    static Scanner scan = new Scanner(System.in);
//    static StudentBehavior shukriClass = new StudentBehavior(String name, String classBlock, int dailyBehaviorScore, int date);
    static String option = "";

    HashMap<Integer, Student> studentScores;

    public StudentBehavior(String name, String classBlock, int mondayScore, int tuesdayScore, int wednesdayScore, int thursdayScore, int fridayScore, String date, int weeklyAverage) {
        super(name, classBlock,mondayScore,tuesdayScore,wednesdayScore, thursdayScore, fridayScore, date, weeklyAverage);
        this.studentScores = new HashMap<Integer, Student>();

    }
    public void greeting(){
        String optionsMessage = "Welcome to Ms.Elmi's online class behavior system, this is where we will keep track of our behavior scores. \n" + " When you choose the (C) option you'll be prompted to adding the behavior scores you received the past week and you will receive your weekly average at the end. \n" + "When you choose the (R) option, you'll be able to look at your past weekly scores. \n" + "When you choose the (U) option, you'll be able to update your prior scores if a mistake was made. \n" +" Lastly if you choose the (D), you'll be able to delete a weekly average, be careful with this option given that you only have a limited amount of times to do this.";
        System.out.println(optionsMessage);
    }

    public void addScores (){
        System.out.println("You typed (C)");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("What is the date today? Use the format DD/MM/YYYY");
        String date = scan.nextLine();
        System.out.println("What class block are you in?");
        String classBlock = scan.nextLine();
        System.out.println("Add your Monday behavior score please");
        int mondayScore = Integer.parseInt(scan.nextLine());
        System.out.println("Add your Tuesday behavior score please");
        int tuesdayScore = Integer.parseInt(scan.nextLine());
        System.out.println("Add your Wednesday behavior score please");
        int wednesdayScore = Integer.parseInt(scan.nextLine());
        System.out.println("Add your Thursday behavior score please");
        int thursdayScore = Integer.parseInt(scan.nextLine());
        System.out.println("Add your Friday behavior score please");
        int fridayScore = Integer.parseInt(scan.nextLine());
        int weeklyAverage = (mondayScore + tuesdayScore + wednesdayScore + thursdayScore + fridayScore) / 5;
        System.out.println("Your weekly average is " + weeklyAverage);
        Student student = new Student(name, classBlock, mondayScore, tuesdayScore, wednesdayScore, thursdayScore, fridayScore, date, weeklyAverage);
    }


}
