package practice02;

public class Student extends Person {

    private Integer klass;

    public Student(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("I am a Student. I am at Class %d.", klass);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getKlass() {
        return klass;
    }

}
