import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("Enter your first name: ");
        firstName = scanner.next();
        System.out.println("What's your favourite food? ");
        favouriteFood = scanner.next();

        System.out.println("Age: " + age + "\nFirst name: " + firstName + "\nFavourite food: " + favouriteFood);
    }

}