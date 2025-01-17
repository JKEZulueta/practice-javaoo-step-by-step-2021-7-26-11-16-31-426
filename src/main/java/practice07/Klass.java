package practice07;

public class Klass {
    private final int number;
    private Student student;


    public Klass(int number) {
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student student){
        this.student = student;
    }

    public Student getLeader(){
        return student;
    }
}
