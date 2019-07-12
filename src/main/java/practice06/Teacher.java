package practice06;

public class Teacher extends Person {

    private Integer klass;

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", name, age);
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", name, age, klass);
    }


}
