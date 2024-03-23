import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];

        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate average
        double average = calculateAverage(grades);

        // Find highest and lowest grades
        int highestGrade = findHighestGrade(grades);
        int lowestGrade = findLowestGrade(grades);

        // Output results
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);

        scanner.close();
    }

    // Method to calculate average
    public static double calculateAverage(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to find highest grade
    public static int findHighestGrade(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    // Method to find lowest grade
    public static int findLowestGrade(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
}
