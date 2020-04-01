
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#3 Variables to be used
		
		double rice = 3.50;
		double chocolate = 2.50;
		double mondaymoney = 10.00;
		double fridaymoney = 75.99;
		int childfriends = 10;
		double adultfriends = 175;
		int childage = 7;
		int currentage = 33;
		String firstname = "Joshua";
		String nickname = "Josh";
		String lastname = "Smith";
		char middleinitial = 'D';
		
		//#4 operations using above variables
		
		double Wallet = fridaymoney - rice;
		double Totalfriends = adultfriends / (currentage - childage);	
		String FullName = firstname + " " + middleinitial + " " + lastname;
		System.out.println(Wallet);
		System.out.println(Totalfriends);
		System.out.println(FullName);
				
		
		
		
		
		
		
		
	}

}
