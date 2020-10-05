import java.util.Scanner;
/* Activity 1.2 - Question 2 */


class Question1 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      String name; 

      System.out.println("What is your Name?"); 

      name = scan.nextLine(); 

      System.out.println("Hi " + name + ", nice to see you.");

    }
}