package practice05;

public class Person {

    protected String name;
    protected Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
