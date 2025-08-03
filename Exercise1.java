//Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard (Marks are out of 100).
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Calculate the percentage of students.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of Subject 1 is : ");
        int Subject1 =sc.nextInt();
        System.out.println("Marks of Subject 2 is : ");
        int Subject2 =sc.nextInt();
        System.out.println("Marks of Subject 3 is : ");
        int Subject3 =sc.nextInt();
        System.out.println("Marks of Subject 4 is : ");
        int Subject4 =sc.nextInt();
        System.out.println("Marks of Subject 5 is : ");
        int Subject5 =sc.nextInt();

        int MarksObtained = Subject1 + Subject2 +Subject3 + Subject4 + Subject5;
        System.out.println("Total Marks Obtained : "+ MarksObtained);
        int totalMarks = 500;
        double percentage = (MarksObtained / (double) totalMarks )* 100;
        System.out.println("Percentage: " +percentage + "%");

    }
}
