package practice10;


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
        if (student.getKlass() == null) {
            System.out.println("It is not one of us");
        } else {
            this.leader = student;
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
    // 判断是否和当前对象相等
    public boolean isIn(Student student) {
        return student.getKlass() == this;
    }
}
