public class Student {
    private String name;
    private String classBlock;
    private int dailyBehaviorScore;
    private int date;
    private int weeklyAverage;

    public Student(String name, String classBlock, int dailyBehaviorScore, int date) {
        this.name = name;
        this.classBlock = classBlock;
        this.dailyBehaviorScore = dailyBehaviorScore;
        this.date = date;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classBlock='" + classBlock + '\'' +
                ", dailyBehaviorScore=" + dailyBehaviorScore +
                ", date=" + date +
                '}';
    }


}
