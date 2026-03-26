package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class ListEditor {
    public void removeStudentWhoHasRatingLow3(List<Student> students) {
        students.removeIf(student -> student.getRating() < 3);
    }

    public List<Student> studentsWithBadRating(List<Student> students) {
        ArrayList<Student> studentsWithRate3 = new ArrayList<>();
        for (Student student : students) {
            if (student.getRating() < 3) {
                studentsWithRate3.add(student);
            }
        }
        return studentsWithRate3;
    }

    public List<Student> studentsWhoUpNextCourse(List<Student> students) {
        ArrayList<Student> nextCourse = new ArrayList<>();
        for (Student student : students) {
            if (student.getRating() >= 3) {
                student.setCourse(student.getCourse() + 1);
                nextCourse.add(student);
            }
        }
        return nextCourse;
    }

    public ArrayList<String> printStudents(List<Student> students, int course) {
        ArrayList<String> studentsOnCourse = new ArrayList<>();
        String studentName = "";
        for (Student student : students) {
            if (student.getCourse() == course) {
                studentName = student.getName();
                studentsOnCourse.add(studentName);
            }
        }
        return studentsOnCourse;
    }
}