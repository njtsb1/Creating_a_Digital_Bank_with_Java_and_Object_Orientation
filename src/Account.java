public abstract class Account implements IAccount {
	
	// attributes
	private static final int BRANCH_STANDARD = 1;
	private static int SEQUENTIAL = 1;

	protected int agency;
	protected int number;
	protected double balance;
	protected Client client;

	// constructor
	public Account(Client client) {
		this.agency = Account.BRANCH_STANDARD;
		this.number = SEQUENTIAL++;
		this.client = client;
	}

	// withdraw method
	@Override
	public void towithdraw(double value) {
		balance -= value;
	}

	// deposit method
	@Override
	public void deposit(double value) {
		balance += value;
	}

	// transfer method
	@Override
	public void transfer(double value, IAccount accountDestination) {
		this.towithdraw(value);
		accountDestination.deposit(value);
	}

	// get the agency
	public int getAgency() {
		return agency;
	}

	// get the number
	public int getNumber() {
		return number;
	}

	// get the balance
	public double getBalance() {
		return balance;
	}

	// shows the information in the form of a message
	protected void printCommonInfos() {
		System.out.println(String.format("Holder: %s", this.client.getName()));
		System.out.println(String.format("Agency: %d", this.agency));
		System.out.println(String.format("Number: %d", this.number));
		System.out.println(String.format("Balance: %.2f", this.balance));
	}
}
