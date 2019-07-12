package practice11;

import utils.Utils;

import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private List<Klass> classes;

    public Teacher(Integer id, String name, Integer age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> klass.getTeachers().add(this));
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (classes == null)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", name, age);
        else {
            List klassNumberList = classes.stream().map(Klass::getNumber).collect(Collectors.toList());
            String classesStr = Utils.join(klassNumberList.toArray(), ", ", 0, klassNumberList.size());
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %s.", name, age, classesStr);

        }

    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", name, age, student.name);
        } else {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.", name, age, student.name);
        }
    }

    public boolean isTeaching(Student student) {
        return classes.stream().map(Klass::getNumber).collect(Collectors.toList()).contains(student.getKlass().getNumber());
    }


}
