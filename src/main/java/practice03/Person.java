package practice03;

public class Person {
    private int klass;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return String.format("My name is %s. I am %d years old.", name, age);
        ////MessageFormat.format("My name is {0}. I am {1} years old.", name, age);
    }

}