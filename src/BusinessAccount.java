
public class BusinessAccount extends Account{

	public BusinessAccount(String name, int accountID, String phoneNum, String socNum, int balance, String type ) {
		super(name, accountID, phoneNum, socNum, balance, type);
	}

	public static final String type = "B";
		
	double getInterest(){
		
		return 0;
	}
}
