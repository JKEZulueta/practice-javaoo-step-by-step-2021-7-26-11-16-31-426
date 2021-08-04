package practice04;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        String worker  = "job";
        String classification = "Worker";
        String result = ("My name is "+ getName() + "." + " I am " + getAge() + " years old." + " " + "I am a "+
        classification + "." + " I have a " +worker+".");

        return result;
    }
}
