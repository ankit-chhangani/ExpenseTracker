package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
     public static void main() {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        ExpenseService service=context.getBean(ExpenseService.class);
        service.addExpense(new Expense(1,100,"food"));
         service.addExpense(new Expense(2,300,"clothes"));
        double totalExpense = service.totalExpense();
         System.out.println("totalexpense= "+totalExpense);
        Expense expense= service.findExpenseById(2);
         System.out.println("ID: "+expense.getId()+"\n"+
                 "Amount: " +expense.getAmount()+"\n"+"Category: "+expense.getCategory());
        String deletion= service.deletingExpenseById(1);
         System.out.println(deletion);
     }
}
