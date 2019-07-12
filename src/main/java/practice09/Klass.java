package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private Integer number;
    private String displayName;
    private Student leader;
    private List<Student> member = new ArrayList<>();

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
        }
    }

    public void appendMember(Student student) {
        member.add(student);
    }

    public Student getLeader() {
        return leader;
    }
}
