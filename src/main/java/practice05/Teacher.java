package practice05;

public class Teacher extends Person {
    private int klass;
    public Teacher(String name, int age) {
        super(name, age);

    }

    public Teacher(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){
        return klass!=0?
                (super.introduce() + " I am a Teacher. I teach Class " + klass + "."):
                (super.introduce() + " I am a Teacher. I teach No Class.");
    }

    int getKlass(){
        return klass;
    }
}
