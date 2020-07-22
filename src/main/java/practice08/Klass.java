package practice08;

public class Klass {
    private Student leader;

    private int number;

    public Klass() {

    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class 2";
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }

    public Student getLeader() {
        return this.leader;
    }
}
