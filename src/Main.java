import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Jonathan L
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String favoriteFood;
        int age;
        System.out.println("what is your age");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your name");
        firstName = scanner.nextLine();

        System.out.println("what's your favorite food");
        favoriteFood = scanner.nextLine();
        scanner.close();
        System.out.println("Name: "+firstName);
        System.out.println(" ");
        System.out.println("Age: "+age);
        System.out.println(" ");
        System.out.println("Favorite Food: "+favoriteFood);


    }

}
