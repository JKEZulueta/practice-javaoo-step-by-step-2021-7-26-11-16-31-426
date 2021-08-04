package practice08;



public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;

    }

    public Klass getKlass(){
        return klass;
    }

    @Override
    public String introduce(){
        if(this.equals(klass.getLeader())) {
            return String.format("%s I am a Student. I am Leader of %s.", super.introduce(), klass.getDisplayName());
            //My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.

        }else{
            return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
            //My name is Tom. I am 21 years old. I am a Student. I am at Class 2
        }
    }
}
