package university;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by admin on 14.08.15.
 */
public abstract class Human {
    private String name;
    private String surname;
    private DateTime birthdate;
    private String sex;

    public Human(String name, String surname, DateTime birthdate, String sex) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public DateTime getBithdate() {
        return birthdate;
    }

    public void setBithdate(DateTime birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public abstract String getInfo();

}
