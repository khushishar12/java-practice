//Note : for the 3rd question here we Import Scanner...
import java.util.Scanner;
public class Practice2 {
    public static void main(String[]args){
        //1. what will be the result of the following expression

        float d = 7/4.0f * 9/2.0f;
       System.out.println(d);   //answer = 7.875

       //2. Write a java program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade.

       char grade = 'B';
       grade = (char)(grade + 8)  ;  
       System.out.println(grade);  //after this we got a J letter . 

       //Decrypting the grade 
       grade = (char)(grade - 8);
       System.out.println(grade);  //answer = after a decryting we got the output B

       //3. Use Comparison operators to find out whether a given number is greater than the user entered number or not.

       Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);    //answer = if it greater then 8 then true otherwise False.

        //4. Write the following expression in a java program.
        //v^2-u^2\2a5

        float v=10;
        float u=5;
        float a=6;
        float s=7;
        float c = (v*v - u*u)/(2*a*s); //answer = 0.8928approx
        System.out.println(c);

    // 5. find the value of the following expression:
    // int x = 7
    //int a = 7 * 49/7 + 35/7   value of a?
    
      int e = (7 * 49/7) + (35/7);
      System.out.println(e); // answer = 54

    }
}
