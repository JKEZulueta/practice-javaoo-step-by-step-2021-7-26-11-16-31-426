package practice03;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        String worker = "job";
        return String.format("I am a Worker. I have a %s.", worker);
    }
}
