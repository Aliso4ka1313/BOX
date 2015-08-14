package university;

/**
 * Created by admin on 14.08.15.
 */
public class StudentUtil {

    Student [] students = {
            new Student("Vasya", "Ivanow", 17, "m",1),
            new Student("Vasya", "Petrov", 39, "m",1),
            new Student("Sergey", "Simonov", 20, "m",1),
            new Student("Zhora", "Woker", 16, "m",1),
            new Student("Jack", "Smith", 21, "m",1),
            new Student("Lora", "Valdi", 18, "f",1),
            new Student("Sioma", "James", 20, "m",1),
            new Student("Marco", "Pantani",25, "m",1),
            new Student("Lina", "Siumak", 24, "f",1),
            new Student("Ira", "Mazur", 24, "f",1),
            new Student("John", "Stone", 19, "m",1),
            new Student("Vittore", "Manzoni", 65, "m",1),
    };
    Group g1 = new Group(students,1);
}
