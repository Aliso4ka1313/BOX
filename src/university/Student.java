package university;

import org.joda.time.DateTime;

/**
 * Created by admin on 14.08.15.
 */
public class Student extends Human {
    private int gpa;

    public Student(String name, String surname, DateTime birthdate, String sex, int gpa){
        super (name, surname, birthdate, sex);
        this.gpa = gpa;
    }

    @Override
    public String getInfo(){
        return String.format("Student data: %s,%s,%s,%s,%d", getName(),getSurname(),
                getBithdate(),getSex(),gpa);
    }
}
