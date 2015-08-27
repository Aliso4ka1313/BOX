package university;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Scanner;

/**
 * Created by admin on 14.08.15.
 */
public class StudentUtil {
    DateTimeFormatter birthdate = DateTimeFormat.forPattern("dd.MM.yyyy");
    Student[] students = {
            new Student("Vasya", "Ivanow", birthdate.parseDateTime("01.01.1985"), "m", 56),
            new Student("Vasya", "Petrov", birthdate.parseDateTime("12.07.1959"), "m", 35),
            new Student("Sergey", "Simonov", birthdate.parseDateTime("11.04.1990"), "m", 100),
            new Student("Zhora", "Woker", birthdate.parseDateTime("01.01.1975"), "m", 42),
            new Student("Jack", "Smith", birthdate.parseDateTime("02.04.1989"), "m", 90),
            new Student("Lora", "Valdi", birthdate.parseDateTime("28.09.1990"), "f", 11),
            new Student("Sioma", "James", birthdate.parseDateTime("13.05.1973"), "m", 85),
            new Student("Marco", "Pantani", birthdate.parseDateTime("30.07.1990"), "m", 79),
            new Student("Lina", "Siumak", birthdate.parseDateTime("29.02.2000"), "f", 56),
            new Student("Ira", "Mazur", birthdate.parseDateTime("27.03.2000"), "f", 34),
            new Student("John", "Stone", birthdate.parseDateTime("15.10.1977"), "m", 44),
            new Student("Vittore", "Manzoni", birthdate.parseDateTime("23.05.1961"), "m", 40),
    };



    public String findStudentBySurname() {
        Group g1 = new Group(students);
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.next();
        String result = null;
        for (Student student : students) {
            if (student.getSurname().equals(temp))
                result = student.getInfo();
        }
        return result;
    }
}
