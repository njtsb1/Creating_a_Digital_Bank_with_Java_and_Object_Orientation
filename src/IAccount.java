// passando valores para os métodos 
public interface IAccount {
	void towithdraw(double value);
	void deposit(double value);
	void transfer(double value, IAccount Accountdestination);
	void printExtract();
}
