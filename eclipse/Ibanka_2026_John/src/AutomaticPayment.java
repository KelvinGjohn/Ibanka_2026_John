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
	public void setTitle(String inputTitle, String title) {
		if (title == null && inputTitle.isEmpty()) {
			throw new IllegalArgumentException("NOTE: Title cannot be empty!");
		}
		this.title = title; 
	}
	public void setScheduleType(AutomatedPaymentScheduleType inputScheduleTypes, AutomatedPaymentScheduleType scheduleType) {
		if(inputScheduleTypes == null) {
			throw new IllegalArgumentException("NOTE:cannot be empty!");
		}
		this.scheduleType = scheduleType;
	}
	public void setNextPaymentDate(LocalDateTime inputNextPaymentDate, LocalDateTime nextPaymentDate) {
		if (nextPaymentDate == null) {
			throw new IllegalArgumentException("NOTE:Next cannot be empty!");
		}
		this.nextPaymentDate = nextPaymentDate;
		
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
