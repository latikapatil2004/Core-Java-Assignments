/*2. Write a Java program using nested try-catch blocks to access an array element, divide two numbers, and
convert a string into an integer. Handle exceptions at appropriate levels and include finally blocks in both
inner and outer try-catch structures. Demonstrate which blocks execute for different exceptions*/



import java.util.*;

class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        int arr[] = new int[5];

        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            System.out.println("Outer try block started");

            try {
                int num = Integer.parseInt(str);
                System.out.println("Number is: " + num);

                int division = a / b;
                System.out.println("Division is: " + division);

                System.out.println("Array element: " + arr[5]);

            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + e);
            } catch (ArithmeticException e) {
                System.out.println("Division error: " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array error: " + e);
            } finally {
                System.out.println("Inner finally always executes");
            }

        } catch (Exception e) {
            System.out.println("Outer error: " + e);
        } finally {
            System.out.println("Outer finally always executes");
        }

        sc.close();
    }
}
