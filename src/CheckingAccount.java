
public class CheckingAccount extends Account {
	
	public CheckingAccount(String name, int accountID, String phoneNum, String socNum, int balance, String type ) {
		super(name, accountID, phoneNum, socNum, balance, type);
	}
	
	public static final String type = "C";
	
	double getInterest(){
		
		return (balance * .025) / 12;
	}
}
