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

        System.out.println("what is your name");
        firstName = scanner.next();

        System.out.println("what's your favorite food");
        favoriteFood = scanner.next();
        scanner.close();
        System.out.println("Name: "+firstName +"\n\nAge: "+age+"\n\nfavorite food: "+favoriteFood);


    }

}
