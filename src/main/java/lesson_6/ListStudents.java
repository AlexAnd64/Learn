package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ListStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", "GPS", 3, 4));
        students.add(new Student("Sonya", "PTT", 2, 5));
        students.add(new Student("Zoya", "PTT", 2, 2));
        students.add(new Student("Ivan", "SPB", 2, 4));
        students.add(new Student("Semen", "VTB", 3, 1));

        System.out.println("Все студенты: ");
        students.forEach(System.out::println);
        System.out.println(" ");

        ListEditor editor = new ListEditor();
        List<Student> badStudents = editor.studentsWithBadRating(students);
        System.out.println("Студенты с оценкой ниже 3:");
        badStudents.forEach(System.out::println);
        System.out.println(" ");

        editor.removeStudentWhoHasRatingLow3(students);
        System.out.println("Студенты с проходной оценкой: ");
        students.forEach(System.out::println);
        System.out.println(" ");

        System.out.println("Студенты, которые перешли на следующий курс: ");
        List<Student> nextCourse = editor.studentsWhoUpNextCourse(students);
        nextCourse.forEach(System.out::println);
        System.out.println(" ");

        int course = 4;
        System.out.println("Студенты, которые теперь учатся на " + course + " курсе:");
        System.out.println(editor.printStudents(students, course));
    }
}