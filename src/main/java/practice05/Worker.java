package practice05;

public class Worker extends Person {

    public Worker(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Worker. I have a job.", name, age);
    }

}
