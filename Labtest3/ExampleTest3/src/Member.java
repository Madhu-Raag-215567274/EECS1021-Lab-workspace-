
public class Member {
	Order[] mem;
	int no;
	String id;
	double bla;
		static int l =1;
		double atm;

	Member(double d) {
		this.bla= d;
		this.id= "mem"+ l;
		l++;
		this.mem= new Order[100];
		
	}


	Member() {
		this.bla=0;
		this.mem= new Order[100];
		this.id= "mem"+ l;
		l++;
				
	}


	String getId() {
	
		
		return id;
	}


	double getBalance() {
		
		
		return this.bla;
	}


	 Order[] getOrders() {
		 Order[] num = new Order[this.no];
		 for(int i =0 ; i< num.length;i++) {
			 num[i]= this.mem[i];
		 }
		 
		 
		return num;
	}


	double getAmountToPay() {
		double sum =0;
		
	for(int i =0 ; i < this.no; i++) {
		sum =this.atm;
		
		this.atm= mem[i].price *mem[i].quan;	
		
	}
double tot = sum+this.atm;
	 
		return tot;
	}


	 void deposit(double d) {
		this.bla += d;
	}


	 void addOrder(Order o1) {
		this.mem[this.no]= o1;
		this.no++;
	}


	void addOrder(String string, double d, int i) {
		Order num = new Order (string, d, i);
		mem[no]=num;
		no++;
		
	}
	




}
