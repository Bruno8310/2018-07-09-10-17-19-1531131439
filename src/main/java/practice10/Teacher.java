package practice10;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{

    private List<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList ) {
        super(id, name, age);
        this.classes = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String teacherStr = super.introduce() + " I am a Teacher. I teach Class ";

            for (Klass klass: this.classes
                 ) {
                    teacherStr += " " + klass.getNumber() + ",";
            }

            return teacherStr.substring(0, teacherStr.length() -1 ) + ".";
        }
    }

    public boolean isTeaching(Student student) {
        for (Klass klass: this.classes
             ) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public  String introduceWith(Student student) {
        for (Klass klass : this.classes) {
            if (klass.getNumber() == student.getKlass().getNumber()) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

}
