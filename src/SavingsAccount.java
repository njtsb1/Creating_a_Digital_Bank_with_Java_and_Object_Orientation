public class SavingsAccount extends Account {

	// calls the client's parent class's constructor
	public SavingsAccount(Client client) {
		super(client);
	}

	// displays message and executes a method
	@Override
	public void printExtract() {
		System.out.println("=== Savings Account Statement ===");
		super.printCommonInfos();
	}
}
