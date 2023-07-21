package none.cvg.maven.datetime.greetinggen;


import none.cvg.maven.greeting.Greeting;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GreetingGenerator {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        System.out.println("\n" + greeting.greet());


        Map<String, Double> expenses = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Expense Tracker");

        while (true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addExpense(expenses, scanner);
                case 2 -> viewTotalExpenses(expenses);
                case 3 -> {
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addExpense(Map<String, Double> expenses, Scanner scanner) {
        System.out.print("Enter the expense description: ");
        String description = scanner.next();

        System.out.print("Enter the expense amount: ");
        double amount = scanner.nextDouble();

        expenses.put(description, expenses.getOrDefault(description, 0.0) + amount);

        System.out.println("Expense added successfully.");
    }

    private static void viewTotalExpenses(Map<String, Double> expenses) {
        System.out.println("\nTotal Expenses:");

        double totalExpenses = 0;
        for (Map.Entry<String, Double> entry : expenses.entrySet()) {
            double amount = entry.getValue();
            totalExpenses += amount;
        }

        System.out.println("Total: $" + totalExpenses);
    }
}
