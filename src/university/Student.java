package university;

/**
 * Created by admin on 14.08.15.
 */
public class Student extends Human {
    private int groupNumber;

    public Student(String name, String surname, int age, String sex, int groupNumber){
        super (name, surname, age, sex);
        this.groupNumber = groupNumber;
    }

    @Override
    public String getInfo(){
        return String.format("Student data: %s,%s,%d,%s,%d", getName(),getSurname(),
                getAge(),getSex(),groupNumber);
    }
}
