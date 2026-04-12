package service;


import java.time.LocalDate;
import java.util.ArrayList;

import model.AutomaticPayment;
import model.BankAccount;
import model.Card;
import model.Client;
import model.Employee;
import model.Transaction;

public class MainService {
	public static ArrayList<Client>allClient = new ArrayList<Client>();  

    public static void main(String[] args) {
    	Employee K2 = new Employee();
    	System.out.println(K2);
    	
    	Card k7 = new Card("1234 5678 8765 4687", LocalDate.now(), 123, true, null);
    	System.out.println(k7);
    	
    	BankAccount J5 = new BankAccount(0, "KJ27 3769 4781 3872 7837", 9000,true);
    	BankAccount J6 = new BankAccount();
    	System.out.println(J5);
    	
    	Transaction G7 = new Transaction();
    	System.out.println(G7);
    	
    	System.out.println(J6);
    	

    	AutomaticPayment Z5 = new AutomaticPayment();
    	System.out.println(Z5);

       

        
    }
}