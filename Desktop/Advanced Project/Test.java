package Course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        try {
            // Creating five Student objects
            Student student1 = new Student("John Doe", "12345", "123 Main St", "Male", "Canada", "S123", "rich");
            Student student2 = new Student("Alice Smith", "54321", "456 Elm St", "Female", "Canada", "S456", "middle");
            Student student3 = new Student("Bob Johnson", "98765", "789 Oak St", "Male", "Canada", "S789", "poor");
            Student student4 = new Student("Emily Brown", "13579", "246 Pine St", "Female", "Canada", "S246", "middle");
            Student student5 = new Student("Michael Lee", "24680", "135 Cedar St", "Male", "Canada", "S135", "poor");

            // Creating an ArrayList of students
            ArrayList<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);

            // Creating an ArrayList of courses
            ArrayList<OnlineCourse> courses = new ArrayList<>();
            courses.add(new OnlineCourse("Introduction to Programming", "CSE101", "Learn the basics of programming", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Spring 2024", 99.99, "Udemy", "Credit Card"));
            courses.add(new OnlineCourse("Data Structures and Algorithms", "CSE201", "Explore advanced data structures and algorithms", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Fall 2024", 129.99, "Coursera", "PayPal"));
            courses.add(new OnlineCourse("Machine Learning", "CSE301", "Dive into the world of machine learning", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Summer 2024", 149.99, "edX", "Credit Card"));
            courses.add(new OnlineCourse("Web Development", "CSE401", "Master the art of web development", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Winter 2024", 79.99, "Codecademy", "Stripe"));
            courses.add(new OnlineCourse("Cybersecurity Fundamentals", "CSE501", "Learn essential cybersecurity concepts", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Spring 2025", 109.99, "LinkedIn Learning", "Credit Card"));

            // Creating some InteractiveCourse objects
            InteractiveCourse interactiveCourse1 = new InteractiveCourse("Java Programming", "CSE601", "Learn Java programming interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         students, new ArrayList<>(), new ArrayList<>(), "Spring 2024", 149.99, "Online Platform A", 100,
                                                                         new ArrayList<>(), "Credit Card");
            InteractiveCourse interactiveCourse2 = new InteractiveCourse("Python Programming", "CSE602", "Learn Python programming interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         students, new ArrayList<>(), new ArrayList<>(), "Fall 2024", 129.99, "Online Platform B", 150,
                                                                         new ArrayList<>(), "PayPal");
            InteractiveCourse interactiveCourse3 = new InteractiveCourse("Web Development Fundamentals", "CSE603", "Master the basics of web development interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         students, new ArrayList<>(), new ArrayList<>(), "Summer 2024", 79.99, "Online Platform C", 80,
                                                                         new ArrayList<>(), "Stripe");
            ArrayList<Course> ListsOfCourses = new ArrayList<Course>(10);
            ListsOfCourses.add(interactiveCourse3);
            ListsOfCourses.add(courses.get(0));
            ListsOfCourses.add(interactiveCourse2);
            ListsOfCourses.add(courses.get(3));
            System.out.println(ListsOfCourses.get(0).compareTo(ListsOfCourses.get(1)));
            // Sorting the ListsOfCourses ArrayList
            Collections.sort(ListsOfCourses);

            // Printing the sorted list
            for (Course course : ListsOfCourses) {
                System.out.println(course.getName()+ " - Price: " + course.getPrice());
            }
           
            // Adding a random course to each student
            Random random = new Random();
            for (Student student : students) {
                int index = random.nextInt(courses.size());
                student.addCourse(courses.get(index));

            }
            ArrayList<Chapter> Chapters=new ArrayList<Chapter>(3);
            Chapters.add(new Chapter());
            Chapters.add(new Chapter());
            Chapters.add(new Chapter());
            Quiz quiz1 = new Quiz(LocalDate.now(), Chapters, 10, true);
            Quiz quiz2 = new Quiz(LocalDate.of(2024, 5, 12), Chapters, 15, false);
            Quiz quiz3 = new Quiz(LocalDate.of(2023, 8, 20), Chapters, 20, true);
            Quiz quiz4 = new Quiz(LocalDate.of(2024, 2, 28),Chapters, 25, false);
            Quiz quiz5 = new Quiz(LocalDate.of(2025, 1, 15), Chapters, 30, true);
          ArrayList<Quiz> Quizes=new ArrayList<Quiz>(10);
          Quizes.add(quiz5);
          Quizes.add(quiz3);
          Quizes.add(quiz2);
         courses.get(0).setQuizzes(Quizes);
         System.out.println(courses.get(0).toString());

            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
