package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age){
        super(name, age);
    }


    public void setKlass(Klass klass){
        this.klass = klass;
    }

    @Override
    public String introduce(){
        if(klass != null) {
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }

    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student student) {
        if(klass.getNumber() == student.getKlass().getNumber()){
           return String.format("%s I am a Teacher. I teach %s.",super.introduce(), student.getName());
           //My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
        } else {
            return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
            //My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.
        }
    }
}
