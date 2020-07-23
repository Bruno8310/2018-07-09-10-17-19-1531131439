package practice11;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Student leader;

    private int number;

    private List<JoinListener> joinListeners = new ArrayList<>();

    public Klass() {

    }

    public Klass(int number) {
        this.number = number;
    }

    public Klass(Student leader, List<JoinListener> joinListeners) {
        this.leader = leader;
        this.joinListeners = joinListeners;
    }

    public List<JoinListener> getJoinListeners() {
        return joinListeners;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class 2";
    }

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
            joinListeners.forEach(joinListener -> {
                joinListener.update(student);
            });
        } else {
            System.out.println("It is not one of us");
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        joinListeners.forEach(joinListener -> {
            joinListener.update(student);
        });
    }

    public boolean isIn(Student student) {
        return student.getKlass() == this;
    }
}
