
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("\n\n\t\t\t\t\tNote marks must be less than 100");
    System.out.print("\nEnter the total Subject: ");
    int a = sc.nextInt();
    float sum = 0;
    float percentage;

    for (int i = 1; i <= a; i++) {
      System.out.print("Enter marks of subject " + (i) + " is ");
      float b = sc.nextInt();
      sum = sum + b;
    }
    percentage = (sum / a);

    System.out.println("\n\n@ ------------------------------------------------------------- @");
    System.out.println("@\t\t\t\t\t\t\tRESULT\t\t\t\t\t\t\t\t@");
    System.out.println("@\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t@");
    System.out.println("@\t\t\t\t" + ("Total Marks " + sum + " out of " + (a * 100)) + "\t\t\t\t\t@");
    System.out.println("@\t\t\t\t" + ("Percentage is " + percentage) + "%\t\t\t\t\t\t\t\t@");
    if (percentage == 100 || percentage >= 90) {
      System.out.println("@\t\t\t\t" + "Grade A+" + "\t\t\t\t\t\t\t\t\t\t@");
    } else if (percentage == 89 || percentage >= 80) {
      System.out.println("@\t\t\t\t" + "Grade A " + "\t\t\t\t\t\t\t\t\t\t@");
    } else if (percentage == 79 || percentage >= 70) {
      System.out.println("@\t\t\t\t" + "Grade B+" + "\t\t\t\t\t\t\t\t\t\t@");
    } else if (percentage == 69 || percentage >= 60) {
      System.out.println("@\t\t\t\t" + "Grade B " + "\t\t\t\t\t\t\t\t\t\t@");
    } else if (percentage == 59 || percentage >= 50) {
      System.out.println("@\t\t\t\t" + "Grade C+" + "\t\t\t\t\t\t\t\t\t\t@");
    } else if (percentage == 49 || percentage >= 40) {
      System.out.println("@\t\t\t\t" + "Grade C " + "\t\t\t\t\t\t\t\t\t\t@");
    } else if (percentage == 39 || percentage >= 33) {
      System.out.println("@\t\t\t\t" + "Grade D " + "\t\t\t\t\t\t\t\t\t\t@");
    } else {
      System.out.println("@\t\t\t\t" + "Fail " + "\t\t\t\t\t\t\t\t\t\t\t@");
    }
    System.out.println("@ _____________________________________________________________ @");
  }
}
