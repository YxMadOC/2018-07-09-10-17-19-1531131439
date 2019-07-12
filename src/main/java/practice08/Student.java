package practice08;

public class Student extends Person {

    private Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.equals(klass.getLeader())) {
            return String.format("My name is %s. I am %d years old. I am a Student. I am Leader of Class %d.", name, age, klass.getNumber());
        } else {
            return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", name, age, klass.getNumber());
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }

}
