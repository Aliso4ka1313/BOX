package university;

/**
 * Created by admin on 14.08.15.
 */
public  class Group {
    private int groupNumber;
    private Student [] students;

    public Group(Student[] students, int groupNumber) {
        this.students = students;
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
