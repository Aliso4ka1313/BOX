package university;

import java.util.Scanner;

/**
 * Created by admin on 14.08.15.
 */
public  class Group {
    private Student [] students = new Student [12];

    public Group(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}
