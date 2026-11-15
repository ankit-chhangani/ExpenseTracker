package org.example;



import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;

@Repository
public class ExpenseRepository {

    private final ArrayList<Expense> list=new ArrayList<>();
    
    public void addExpense(Expense e){
        System.out.println("Adding expense");
        list.add(e);
        System.out.println("expense added successfully");
    }

    public ArrayList<Expense> returnAllExpense(){
       return list;
    }
    public Expense findExpense(int id){
        System.out.println("finding expense");
        for(Expense e:list){
            if(e.getId() == id){
              return e;
            }
        }
        return null;
    }
    public boolean deletingExpense(int id){
        System.out.println("deleting expense");
        Iterator<Expense> iterator= list.iterator();
        while(iterator.hasNext()){
            Expense e=iterator.next();
            if(e.getId()==id){
                iterator.remove();
                System.out.println("expense deleted successfully");
                return true;
            }
        }
        return false;
        }



    }
