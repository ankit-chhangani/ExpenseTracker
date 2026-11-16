
package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ExpenseService service = context.getBean(ExpenseService.class);

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. Find Expense By ID");
            System.out.println("4. Delete Expense");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
           
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();

                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();

                        scanner.nextLine();

                        System.out.print("Enter category: ");
                        String category = scanner.nextLine();

                        service.addExpense(
                                new Expense(id, amount, category)
                        );
                        logger.info(
                                "Expense added successfully. ID: {}, Category: {}, Amount: {}",
                                id, category, amount
                        );
                    }
                    catch (InputMismatchException ime) {
                        logger.error("Please enter valid input", ime);
                    }
                    catch (Exception e) {
                        logger.error("Failed to add expense", e);
                    }

                    break;

                case 2:
                    System.out.println(
                            "Total Expense: " + service.totalExpense()
                    );
                    break;

                case 3:
                    try {
                        System.out.print("Enter expense ID: ");
                        int searchId = scanner.nextInt();

                        Expense expense = service.findExpenseById(searchId);

                        System.out.println("ID: " + expense.getId());
                        System.out.println("Amount: " + expense.getAmount());
                        System.out.println("Category: " + expense.getCategory());
                    }
                    catch (Exception e){
                        logger.error("failed to find expense by id",e);
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter expense ID to delete: ");
                        int deleteId = scanner.nextInt();

                        System.out.println(
                                service.deletingExpenseById(deleteId)
                        );
                    }
                    catch (Exception e){
                        logger.error("failed to delete expense by id",e);
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using Expense Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
        context.close();
    }
}
