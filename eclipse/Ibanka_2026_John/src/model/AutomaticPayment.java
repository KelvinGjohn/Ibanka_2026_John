package model;
import java.time.LocalDateTime;

public class AutomaticPayment extends Transaction {
	private String title;
	private  AutomatedPaymentScheduleType scheduleType;
	private LocalDateTime nextPaymentDate;
	private boolean active;
	
	//getters
	public String getTitle() {
		return title;
	}
	public AutomatedPaymentScheduleType getScheduleType() {
		return scheduleType;
	}
	public LocalDateTime getNextPaymentDate() {
		return nextPaymentDate;
	}
	public boolean getActive() {
		return active;
	}
	
	//setters
	public void setTitle(String inputTitle) {
		if (title == null && inputTitle.isEmpty()) {
			throw new IllegalArgumentException("NOTE: Title cannot be empty!");
		}
		title = inputTitle; 
	}
	public void setScheduleType(AutomatedPaymentScheduleType inputScheduleTypes) {
		if(inputScheduleTypes == null) {
			throw new IllegalArgumentException("NOTE:cannot be empty!");
		}
		scheduleType = inputScheduleTypes;
	}
	public void setNextPaymentDate(LocalDateTime inputNextPaymentDate) {
		if (nextPaymentDate == null) {
			throw new IllegalArgumentException("NOTE:Next cannot be empty!");
		}
		nextPaymentDate = inputNextPaymentDate;
		
	}
	public void setActive(boolean inputActive, boolean active) {
		this.active = active;
	}
	
	public boolean executeIFDue() {
		if (active && nextPaymentDate.equals(LocalDateTime.now())) {
			boolean success = execute();
			
			if (success) {
				updateNextPaymentDate();
			}
			return success;
		}
		return false;
	}
	private void updateNextPaymentDate() {
		switch (scheduleType) {
		case Daily: 
			nextPaymentDate = nextPaymentDate.plusDays(1);
			break;
		case Weekly:
			nextPaymentDate = nextPaymentDate.plusWeeks(1);
			break;
		case Monthly:
			nextPaymentDate = nextPaymentDate.plusMonths(1);
			break;
		case Yearly:
			break;
		default:
			break;
		}
		// TODO Auto-generated method stub
		
	}
	
		
	
	
	// no args
	

}
