
public class SavingsAccount extends Account {
	
	public SavingsAccount(String name, int accountID, String phoneNum, String socNum, int balance, String type ) {
		super(name, accountID, phoneNum, socNum, balance, type);
	}
	
	public static final String type = "S";
	
	double getInterest(){
		
		double interest = 0;
		if(balance < 5000){
			interest = (balance * .04) / 12;
		}else{
			interest = (balance * .05) / 12;
		}
		
		return interest;
	}
}
