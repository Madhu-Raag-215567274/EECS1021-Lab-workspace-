class Member {
	String id;
	static int globalCounter = 1;
	Order[] orders;
	int noo; /* number of orders */
	double balance;
	
	Member(double balance) {
		this.balance = balance;
		id = "mem" + globalCounter;
		globalCounter ++;
		orders = new Order[30];
		noo = 0; /* optional */
	}

	Member() {
		this.balance = 0;
		id = "mem" + globalCounter;
		globalCounter ++;
		orders = new Order[30];
		noo = 0; /* optional */
	}
	
	String getId() {
		return id;
	}
	
	double getBalance() {
		return balance;
	}
	
	void addOrder(Order o) {
		orders[noo] = o;
		noo ++;
	}
	
	void addOrder(String product, double price, int quantity) {
		Order o = new Order(product, price, quantity);
		orders[noo] = o;
		noo ++;
	}
	
	Order[] getOrders() {
		Order[] os = new Order[noo];
		for(int i = 0; i < noo; i ++) {
			os[i] = orders[i];
		}
		return os;
	}
	
	double getAmountToPay() {
		double amount = 0;
		for(int i = 0; i < noo; i ++) {
			Order o = orders[i];
			amount += o.getPrice() * o.getQuantity();
		}
		return amount;
	}

	void deposit(double amount) { balance += amount; }
	void withdraw(double amount) {
		balance -= amount;
	}
	
	void clearOrders() {
		noo = 0;
	} 
}
