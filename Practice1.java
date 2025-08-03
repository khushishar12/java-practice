// 1. write a program to sum three numbers in java.
import java.util.Scanner;
 public class Practice1 {
   public static void main(String[] args) {
        int a = 34;
        int b = 56;
       int c = 45;
       int d = a + b + c ;
         System.out.println("Sum of three number are : " + d);
    // }
//}

// 2. Write a program to calculate CGPA using of three subjects (out of 100).
  double maths = 85;
        double science = 78;
        double sst = 90;
        double cgpa = (maths + science + sst)/3;
        
        System.out.println("The cgpa of marks is : " + cgpa);
   // }
 //}

 // 3. Write a java program which asks the user to enter his/her name and greets them with "Hello <name> , have a good day" text.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        //System.out.println("Please enter your name : ");
        System.out.println(" Hello " + name + " have a good day ." );
    //}
//}
 
//4.  Write a java program to convert kilometers to miles.
        double km =10;
        double miles = km * 0.621371;
        System.out.println(km  + " Kilometers =  " + miles + " miles");
    }
}
