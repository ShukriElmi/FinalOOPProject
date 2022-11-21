public class Student {
    private String name;
    private String classBlock;
    private int mondayScore;
    private int tuesdayScore;
    private int wednesdayScore;
    private int thursdayScore;
    private int fridayScore;
    private String date;
    private int weeklyAverage;

    public Student(String name, String classBlock, int mondayScore, int tuesdayScore, int wednesdayScore, int thursdayScore, int fridayScore, String date, int weeklyAverage) {
        this.name = name;
        this.classBlock = classBlock;
        this.mondayScore = mondayScore;
        this.tuesdayScore = tuesdayScore;
        this.wednesdayScore = wednesdayScore;
        this.thursdayScore = thursdayScore;
        this.fridayScore = fridayScore;
        this.date = date;
        this.weeklyAverage = weeklyAverage;
    }

    public Student(String name, String classBlock, int dailyBehaviorScore, String date) {
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

    public int getMondayScore() {
        return mondayScore;
    }

    public void setMondayScore(int mondayScore) {
        this.mondayScore = mondayScore;
    }

    public int getTuesdayScore() {
        return tuesdayScore;
    }

    public void setTuesdayScore(int tuesdayScore) {
        this.tuesdayScore = tuesdayScore;
    }

    public int getWednesdayScore() {
        return wednesdayScore;
    }

    public void setWednesdayScore(int wednesdayScore) {
        this.wednesdayScore = wednesdayScore;
    }

    public int getThursdayScore() {
        return thursdayScore;
    }

    public void setThursdayScore(int thursdayScore) {
        this.thursdayScore = thursdayScore;
    }

    public int getFridayScore() {
        return fridayScore;
    }

    public void setFridayScore(int fridayScore) {
        this.fridayScore = fridayScore;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
                ", mondayScore=" + mondayScore +
                ", tuesdayScore=" + tuesdayScore +
                ", wednesdayScore=" + wednesdayScore +
                ", thursdayScore=" + thursdayScore +
                ", fridayScore=" + fridayScore +
                ", date='" + date + '\'' +
                ", weeklyAverage=" + weeklyAverage +
                '}';
    }
}



