package ternaryoperator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> students = new HashMap<>();

        while (true) {
            System.out.println("\n===== LOGIN SYSTEM =====");
            System.out.print("Enter AF ID (or EXIT to finish): ");
            String id = sc.next().toUpperCase();

            if (id.equals("EXIT")) {
                break;
            }

            if (!id.matches("AF\\d+")) {
                System.out.println("Invalid AF ID! Example: AF123");
                continue;
            }

            if (students.containsKey(id)) {
                System.out.println("ERROR: AF ID already exists!");
                continue;
            }

            System.out.println("\n1. Java");
            System.out.println("2. Python");
            System.out.println("3. AI");
            System.out.print("Enter course number: ");

            int choice = sc.nextInt();
            String course;

            switch (choice) {
                case 1:
                    course = "Java";
                    break;
                case 2:
                    course = "Python";
                    break;
                case 3:
                    course = "AI";
                    break;
                default:
                    System.out.println("Invalid course number!");
                    continue;
            }

            System.out.println("Selected Course: " + course);

            students.put(id, course);
            System.out.println("Registration Successful!");
        }

        // Display final table
        System.out.println("\n==================================");
        System.out.println("       COURSE REGISTRATION");
        System.out.println("==================================");

        System.out.printf("%-15s | %-15s%n", "AF ID", "COURSE");
        System.out.println("----------------------------------");

        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.printf("%-15s | %-15s%n",
                    entry.getKey(), entry.getValue());
        }

        System.out.println("==================================");
        System.out.println("Total Registrations: " + students.size());

        sc.close();
    }
}