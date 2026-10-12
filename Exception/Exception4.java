/*4. Create a custom checked exception named UnderAgeException by extending Exception. Develop a voting
application that accepts a user's age and throws UnderAgeException if the age is below 18. Handle invalid
numeric input separately and display appropriate messages for eligible and ineligible voters.*/	
import java.util.*;

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

class Exception4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new UnderAgeException(
                    "You are underage and not eligible to vote.");
            }

            System.out.println("You are eligible to vote.");

        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a numeric age.");

        } finally {
            sc.close();
        }
    }
}
