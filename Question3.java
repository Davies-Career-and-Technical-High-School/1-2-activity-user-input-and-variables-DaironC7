import java.util.Scanner;
/* Activity 1.2 - Question 3 */


class Question3 {
    public static void main(String[] args) {

       
      Scanner scan = new Scanner(System.in);

      String name;
      String adj;
      

      System.out.println("Hi there. What is your name?"); 

      name = scan.nextLine(); 

      System.out.println("What adjective describes you?"); 

      adj = scan.nextLine(); 

      
      System.out.println("My name is " + name + ". I am " + adj + ".");

    }
}