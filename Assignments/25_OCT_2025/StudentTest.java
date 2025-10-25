import java.io.*;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding 10 Student Objects
        students.add(new Student(1, "Amol", "Java", 85, 91));
        students.add(new Student(2, "Riya", "Python", 55, 70)); // Low attendance
        students.add(new Student(3, "Sagar", "Java", 95, 88));
        students.add(new Student(4, "Sneha", "C++", 78, 79));
        students.add(new Student(5, "Rahul", "Java", 45, 65));
        students.add(new Student(6, "Pooja", "Python", 88, 92));
        students.add(new Student(7, "Ajay", "C", 60, 48));
        students.add(new Student(8, "Maya", "Java", 99, 98));
        students.add(new Student(9, "Yash", "C++", 73, 55));
        students.add(new Student(10, "Neha", "Python", 67, 80));

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            oos.writeObject(students);
            System.out.println("Students serialized successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Displaying grades
        System.out.println("\nCalculating Grades:");
        for (Student s : students) {
            try {
                System.out.println(s + " -> Grade: " + s.calculateGrade());
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
        }

        // Sort students in decreasing order of attendance
        TreeSet<Student> sortedStudents = new TreeSet<>(
                (s1, s2) -> Double.compare(s2.getAttendance_percentage(), s1.getAttendance_percentage())
        );
        sortedStudents.addAll(students);

        System.out.println("\nStudents sorted by attendance (High to Low):");
        for (Student s : sortedStudents) {
            System.out.println(s);
        }
    }
}
