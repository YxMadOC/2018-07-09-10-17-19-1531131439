package practice07;

public class Student extends Person {

    private Klass klass;

    public Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", name, age, klass.getNumber());
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
