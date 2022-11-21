import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class StudentBehavior extends Student {
    static Scanner scan = new Scanner(System.in);
//    static StudentBehavior shukriClass = new StudentBehavior(String name, String classBlock, int dailyBehaviorScore, int date);
    static String option = "";

    HashMap<Integer, Student> studentGrades;

    public StudentBehavior(String name, String classBlock, int dailyBehaviorScore, int date) {
        super(name, classBlock, dailyBehaviorScore, date);
        this.studentGrades = new HashMap<Integer, Student>();

    }


}
