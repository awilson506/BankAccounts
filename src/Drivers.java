import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Drivers {

	public static List<Account> readGrades(){
		//read in all accounts to an arrayList from input.txt
		List<Account> accountList = new ArrayList<Account>();
		try{
			
			BufferedReader read = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			
			while( (line = read.readLine()) != null) {
				
				StringTokenizer tokens = new StringTokenizer(line);
				
				Account account = AccountFactory.getAccount(
						tokens.nextToken(), Integer.parseInt(tokens.nextToken()), tokens.nextToken(),
						tokens.nextToken(), Integer.parseInt(tokens.nextToken()), tokens.nextToken());
				accountList.add(account);
				
			}
			read.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
		return accountList;
	}
	
	public static void printGrades(List<Account> list){
		//output grades into a nicely formatted table
		try {
	    	PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
	    	System.setOut(out);
	    } catch (FileNotFoundException ex) {
	    	return;
	    }
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.format("%-10s%-18s%-15s%-15s%-15s%-15s%n", 
				"Name", "Social Security","Account Num", "Phone Number","Open Bal.", "End Bal.");
		for(Account account : list){
			double interest = account.balance + account.getInterest();
			String endBal = df.format(interest);
			System.out.format("%-10s%-18s%-15s%-15s%-15s%-15s%n", 
					account.name, account.socNum, account.accountID, account.phoneNum, account.balance, endBal );
		}
	}
}
