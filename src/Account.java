
public class Account {
	
	//constructor
	public Account(String name, int accountID, String phoneNum, String socNum, int balance, String type){
		this.name = name;
		this.accountID = accountID;
		this.phoneNum = phoneNum;
		this.socNum = socNum;
		this.balance = balance;
		this.type = type;
	}
	
	public String name;
	public int balance;
	public int accountID;
	public String phoneNum;
	public String socNum;
	public String type;
		
		
	double getInterest(){
		System.out.println("accounts");
		return 2 + balance;
	}
}

