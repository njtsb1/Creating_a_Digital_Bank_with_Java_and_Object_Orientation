import java.util.List;

public class Bank {

	// attributes
	private String name;
	private List<Account> accounts;

	// get the name
	public String getName() {
		return name;
	}

	// it sets the name and the return is empty
	public void setName(String name) {
		this.name = name;
	}

	// get a list of accounts
	public List<Account> getAccounts() {
		return accounts;
	}

	// makes the set of a list of accounts and the return is empty
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
