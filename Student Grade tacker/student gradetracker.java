import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("=================================");
        System.out.println("      STUDENT GRADE TRACKER");
        System.out.println("=================================");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter grade: ");
            double grade = sc.nextDouble();

            names.add(name);
            grades.add(grade);
        }

        // Calculate average
        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = sum / grades.size();

        // Display report
        System.out.println("\n=================================");
        System.out.println("         SUMMARY REPORT");
        System.out.println("=================================");

        System.out.printf("%-15s %s%n", "Student", "Grade");
        System.out.println("---------------------------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%-15s %.2f%n", names.get(i), grades.get(i));
        }

        System.out.println("---------------------------------");
        System.out.printf("Average Grade : %.2f%n", average);
        System.out.printf("Highest Grade : %.2f%n", highest);
        System.out.printf("Lowest Grade  : %.2f%n", lowest);

        System.out.println("=================================");

        sc.close();
    }
}