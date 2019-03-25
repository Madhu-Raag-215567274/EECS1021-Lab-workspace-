
public class Member {
	double balc;
	String id;
	Order[]ord;
	static int l =1;
	double amtpay;
	int no=0;
	

	Member(double balc) {
		this.balc=balc;
		this.id = "mem" +  l;
		this.ord = new Order [30];
		l++;
	
	}
	Member() {
	this.balc=0.0;
	this.id = "mem"+l;
	l++;
	}
	String getId() {
		return this.id;
	}
	Double getBalance() {
		return this.balc;
	}
	Order[]  getOrders() {
		
		Order[] num = new Order[no];
		
		for(int i =0; i<num.length;i++) {
	     num[i]=this.ord[i];
		}
	
		no++;		

		return num;
	}
	double getAmountToPay() {
		double sum=0;
		for(int i =0; i<this.no-1;i++) {
			sum= this.amtpay;
			this.amtpay= this.ord[i].getPrice()*this.ord[i].getQuantity();		
			
		}
		double tot = sum+this.amtpay;
		return tot;
	}
	void deposit (double dep) {
		this.balc= dep+ this.balc;
	}
	 void addOrder(Order oN) {
		 for(int i=0; i<no;i++) {		 
			 this.ord[i]= oN;
		 }
		
	}
	void addOrder(String prdnm, double price, int quant) {
		
		Order ords = new Order(prdnm,  price,  quant);
		this.ord[this.no-1]= ords;
		
	}
	void withdraw(double amount) {
		this.balc -= amount;
	}
	void clear() {
		no=0;
	}







}
