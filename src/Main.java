public class Main {

	public static void main(String[] args) {

		// pass the customer's name
		Client nivaldo = new Client();
		nivaldo.setName("Nivaldo");
		
		// passes the customer's name to the current and savings account
		Account ca = new CurrentAccount(nivaldo);
		Account savings = new SavingsAccount(nivaldo);

		// passes the amounts to deposit and transfer
		ca.deposit(100);
		ca.transfer(100, savings);
		
		// and finally prints the current and savings account statements
		ca.printExtract();
		savings.printExtract();
	}

}
