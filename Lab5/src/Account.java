
public class Account {
	String name;
	char type; 
	double balance;
	
	Account(String name, char type , double balance){
		this.name=name;
		this.type =type;
		this .balance=balance;
//		if (type =='i') {
//			this.balance =balance;
//			this.name=name;
//		}
//		
		
	}
	
	Account(String name, char type ){
		this.name=name;
		this.type =type;
		
	}
	double getBalance () {
		return balance;
	}
	String getDescription() {
		if(type=='i') {
			String desc= "International account with owner "+  this.name+ " has current balance $" + this.balance;
			return desc;
		}
		else {
			String desc= "Domestic account with owner "+  this.name+ " has current balance $" + this.balance;
			return desc;
		}
		
	
	}
	void setBalance(double newBalance) {
		this.balance=newBalance;
	}
	void deposit (double deposit) {
		if (type=='i') {
			this.balance = (deposit-deposit *0.10) + this.balance;
		}
		else {
			this.balance = deposit + this.balance;
		}
	}
	
	
	
}
