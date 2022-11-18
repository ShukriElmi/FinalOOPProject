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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassBlock() {
        return classBlock;
    }

    public void setClassBlock(String classBlock) {
        this.classBlock = classBlock;
    }

    public int getDailyBehaviorScore() {
        return dailyBehaviorScore;
    }

    public void setDailyBehaviorScore(int dailyBehaviorScore) {
        this.dailyBehaviorScore = dailyBehaviorScore;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getWeeklyAverage() {
        return weeklyAverage;
    }

    public void setWeeklyAverage(int weeklyAverage) {
        this.weeklyAverage = weeklyAverage;
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
