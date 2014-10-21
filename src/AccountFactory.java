
public class AccountFactory {
	//determine the type of class to return based on the account type given
	public static Account getAccount(String name, int accountID, String phoneNum, String socNum, int balance, String type)
	{
	    if ( type.equals(BusinessAccount.type) ){
	    	return new BusinessAccount(name, accountID, phoneNum, socNum, balance, type);
	    }
	    else if ( type.equals(CheckingAccount.type) ){
	    	return new CheckingAccount(name, accountID, phoneNum, socNum, balance, type);
	    }
	    else if ( type.equals(SavingsAccount.type) )
	    	return new SavingsAccount(name, accountID, phoneNum, socNum, balance, type);
	    return null;
	  }
}
