
public class Account {
	String name;
	char type; 
	double balance;

	Account(String name, char type , double balance){
		this.name=name;
		this.type =type;
		this .balance=balance;		
	}
	Account(String name, char type ){
		this.name=name;
		this.type =type;
	}
	double getBalance () {
		return this.balance;
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
		if (this.type=='i') {
			this.balance = (deposit-deposit *0.10) + this.balance;
		}
		else {
			this.balance = deposit + this.balance;
		}
	}
	void withdraw(double withdraw ) {
		if (this.type=='i') {
			this.balance = this.balance-(withdraw+withdraw *0.10) ;
		}

		else {
			this.balance = this.balance-(withdraw);
		}

	}
	void transferTo(Account acc, double amount) {
		if (this.type=='d' && acc.type=='d') {
			acc.balance= amount + acc.balance;
			this.balance = this.balance-amount;
		}
		else if(this.type=='i' && acc.type=='i') {
			acc.balance= (amount-amount*0.10) + acc.balance;
			this.balance = this.balance-(amount+amount*0.10);
		}
		else if(this.type=='d' && acc.type=='i') {
			acc.balance= acc.balance+(amount-amount*0.10);
			this.balance= this.balance-amount;
		}
		else {
			this.balance= this.balance-(amount+amount*0.10);
			acc.balance= acc.balance+amount;
		}
	}
}
