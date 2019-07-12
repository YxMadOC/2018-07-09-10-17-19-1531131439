package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private Integer number;
    private String displayName;
    private Student leader;
    private List<Student> member = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class " + number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void assignLeader(Student student) {
        if (!member.contains(student)) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
            this.teachers.forEach(teacher -> System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n", teacher.name, student.name, number)));
        }
    }

    public void appendMember(Student student) {
        member.add(student);
        this.teachers.forEach(teacher -> System.out.print(String.format("I am %s. I know %s has joined Class %s.\n", teacher.name, student.name, number)));
    }

    public Student getLeader() {
        return leader;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
