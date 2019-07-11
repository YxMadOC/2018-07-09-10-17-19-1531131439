package practice06;

public class Student extends Person {

    private Integer klass;

    public Student(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce(){
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", name, age, klass);
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
