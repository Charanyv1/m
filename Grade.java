import java.util.Scanner;

public class Grade{

  // Returns a letter grade based on the average
  static char gradeFunction(double avg) {
    if (avg >= 90) return 'A';
    else if (avg >= 80) return 'B';
    else if (avg >= 70) return 'C';
    else if (avg >= 60) return 'D';
    else return 'F';
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many grades (1 to 5)? ");
    int count = scanner.nextInt();

    // Validate the input count
    if (count < 1 || count > 5) {
      System.out.println("Invalid number. You must enter between 1 and 5 grades.");
      scanner.close();
      return; // Exit
    }

    double sum = 0.0;

    // Read each grade
    for (int i = 1; i <= count; i++) {
      System.out.print("Enter grade " + i + ": ");
      double grade = scanner.nextDouble();
      sum += grade;
    }

    double avg = sum / count;
    System.out.println("Average: " + avg);
    System.out.println("Letter grade: " + gradeFunction(avg));

    scanner.close();
  }
}
