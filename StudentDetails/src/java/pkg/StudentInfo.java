
package pkg;

public class StudentInfo {
    private int id;
    private String name;
    private long phno;
    private int sem;
    private int marks;
    private double percentage;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhno() {
        return phno;
    }

    public int getSem() {
        return sem;
    }

    public int getMarks() {
        return marks;
    }

    public double getPercentage() {
        return percentage;
    }

    public StudentInfo(int id, String name, long phno, int sem, int marks, double percentage) {
        this.id = id;
        this.name = name;
        this.phno = phno;
        this.sem = sem;
        this.marks = marks;
        this.percentage = percentage;
    }
    
    
}
