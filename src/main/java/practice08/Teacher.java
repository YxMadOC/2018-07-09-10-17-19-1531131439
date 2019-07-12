package practice08;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null)
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", name, age);
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", name, age, klass.getNumber());
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber().equals(klass.getNumber())) {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", name, age, student.name);
        } else {
            return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.", name, age, student.name);
        }
    }


}
