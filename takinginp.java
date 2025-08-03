import java.util.Scanner;
public class takinginp {
    public static void main(String[]args){
        System.out.println("Taking input from the user.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);

      // for the float ....float a = sc.nextFloat();
      //for the boolean ....boolean a = sc.hasNextInt();
      //for the string...String str = sc.next();
      //it only print the one word for ex..khushi is a good girl its only print "khushi" 
      //if we want to print the whole sentence we have to write...String str = sc.nextLine();
      //it will print the whole sentence.
    }
}