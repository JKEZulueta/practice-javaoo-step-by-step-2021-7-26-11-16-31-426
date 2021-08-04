package practice08;


import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int number;

    private Student leader;
    private final List<Student> leaders = new ArrayList<>();


    public Klass(int number) {
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %d", number);
    }

    public void assignLeader(Student leader){
        if(leaders.contains(leader)){
            this.leader = leader;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader(){
        return leader;
    }

    public void appendMember(Student student){
        leaders.add(student);
    }
}