package model;
import java.time.LocalDate;

public class AutomaticPayment extends Transaction {
	private String title;
	private  AutomatedPaymentScheduleType scheduleType;
	private LocalDate nextPaymentDate;
	private boolean active;
	
	//getters
	public String getTitle() {
		return title;
	}
	public AutomatedPaymentScheduleType getScheduleType() {
		return scheduleType;
	}
	public LocalDate getNextPaymentDate() {
		return nextPaymentDate;
	}
	public boolean isActive() {
		return active;
	}
	
	//setters
	public void setTitle(String inputTitle) {
		if (title == null && inputTitle.isEmpty()) {
			throw new IllegalArgumentException("NOTE: Title cannot be empty!");
		}
		title = inputTitle; 
	}
	public void setScheduleType(AutomatedPaymentScheduleType inputScheduleType) {
		if (scheduleType == null) {
			scheduleType = inputScheduleType;
		}else {
			throw new IllegalArgumentException("NOTE:Cannot be empty!");
		}
		
	}
	public void setNextPaymentDate(LocalDate inputNextPaymentDate) {
		if (nextPaymentDate == null) {
			nextPaymentDate = inputNextPaymentDate;
		}
		else
		{
			throw new IllegalArgumentException("NOTE:Next cannot be empty!");
		}
		
		
	}
	public void setActive(boolean inputActive) {
		active = inputActive;
	}
	
	public boolean executeIFDue() {
		if (active && nextPaymentDate.equals(LocalDate.now())) {
			boolean success = execute();
			
			if (success) {
				updateNextPaymentDate();
			}
			return success;
		}
		return false;
	}
	private void updateNextPaymentDate() {
		if (scheduleType == AutomatedPaymentScheduleType.Daily) {
			nextPaymentDate = nextPaymentDate.plusDays(1);
		}
		else if 
			(scheduleType == AutomatedPaymentScheduleType.Weekly){
				nextPaymentDate = nextPaymentDate.plusWeeks(1);
			}
		else if (
				scheduleType == AutomatedPaymentScheduleType.Monthly) {
			nextPaymentDate = nextPaymentDate.plusMonths(1);
		}
		
	}
	
	
	// no args
	public AutomaticPayment() {
		super();
		setTitle("GIFT_MONEY");
		setAmount(2000);
		setDescription("Medication bill");
		setScheduleType(AutomatedPaymentScheduleType.Daily);
		setActive(true);
	}
	
	
	//args
	public AutomaticPayment(double amount, String description, BankAccount sourceAccount, BankAccount targetAccount,
			String title,
			AutomatedPaymentScheduleType inputScheduleType,
			LocalDate inputNextPaymentDate,boolean inputActive) {
		super(amount,description,sourceAccount,targetAccount);
		setTitle(title);
		setScheduleType(inputScheduleType);
		setNextPaymentDate(inputNextPaymentDate);
		setActive(inputActive);
		
	}
	
	//String to String
	public String toString() {
		String result = title + "|" + scheduleType + "|" + nextPaymentDate + "|" + active;
		return result;
	}
	

}
