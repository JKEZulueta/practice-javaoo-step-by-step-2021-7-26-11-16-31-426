package practice09;


import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> myClasses;


    public Teacher(int id, String name, int age, LinkedList<Klass> myClasses) {
        super(id, name, age);
        this.myClasses = myClasses;
    }

    public Teacher(int id, String name, int age){
        super(id, name, age);
    }


    public LinkedList<Klass> getClasses(){
        return  myClasses;
    }

    public void setKlass(Klass klass){
        this.klass = klass;
    }

    @Override
    public String introduce(){
        if(myClasses != null){
            String exiClasses = myClasses.stream()
                    .map(Klass::getNumber)
                    .map(Object::toString)
                    .collect(Collectors.joining(", "));
            return String.format("%s I am a Teacher. I teach Class %s.",super.introduce(), exiClasses);
            //My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3.
        } else {
            return String.format("%s I am a Teacher. I teach No Class.",super.introduce());
            //My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.
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

