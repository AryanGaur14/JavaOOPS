import java.lang.*;
import java.util.*;

class Student{
    private String rollNo;
    private String name;
    private int Standard;
    Date d=new Date();
    static  private int structRollNO=0;
    private String rollNoCreation(){
        structRollNO++;
        return "Uni_"+(d.getYear()+1900)+"_"+structRollNO;
    }
    public Student(){
        name="nothingMentioned";
        Standard=00;
    }
    public Student(String name,int Standard){
        rollNo=rollNoCreation();
        this.name=name;
        this.Standard=Standard;
    }
    public String getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public int getStandard(){
        return Standard;
    }

}
public class StudentRollNoAutoGen {
    static public void main(String arg[]){
        Student s1=new Student("Aryan",12);
        Student s2=new Student("Dev",12);
        System.out.println(s1.getRollNo()+" "+s1.getName());
        System.out.println(s2.getRollNo());

    }
}
