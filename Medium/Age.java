import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        System.out.println("Enter your age");

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if (age > 18) {
            System.out.println("Your age is 18+");
            System.out.println("You are eligible to vote");
        }

        System.out.println("This statement is outside the body of if");
    }
}
