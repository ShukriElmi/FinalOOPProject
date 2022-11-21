import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class StudentBehavior extends Student {
    static Scanner scan = new Scanner(System.in);
//    static StudentBehavior shukriClass = new StudentBehavior(String name, String classBlock, int dailyBehaviorScore, int date);
    static String option = "";

    HashMap<Integer, Student> studentScores;

    public StudentBehavior(String name, String classBlock, int dailyBehaviorScore, int date) {
        super(name, classBlock, dailyBehaviorScore, date);
        this.studentScores = new HashMap<Integer, Student>();

    }
    public void greeting(){
        String optionsMessage = "Welcome to Ms.Elmi's online class behavior system, this is where we will keep track of our behavior scores. \n" + " When you choose the (C) option you'll be prompted to adding the behavior scores you received the past week and you will receive your weekly average at the end. \n" + "When you choose the (R) option, you'll be able to look at your past weekly scores. \n" + "When you choose the (U) option, you'll be able to update your prior scores if a mistake was made. \n" +" Lastly if you choose the (D), you'll be able to delete a weekly average, be careful with this option given that you only have a limited amount of times to do this.";
    }


}
