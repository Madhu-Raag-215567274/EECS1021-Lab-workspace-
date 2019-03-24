
public class Order {
	String pdt;
	double prc;
	int qty ;


	 Order(String pdt, double prc, int qty) {
		this.pdt = pdt;
		this.prc = prc;
		this.qty = qty;
		
	}
	 Order(){
		 this.pdt = null;
			this.prc = 0;
			this.qty = 0;
		 
		 
	 }
	 String getProduct() {
		return this.pdt; 
	 }
	 double getPrice() {
		return this.prc;
	}
	int getQuantity() {
		return this.qty;
	}
	void setProduct(String producName){
		this.pdt = producName;
	}
	void setPrice(double price) {
		this.prc=price;
		
	}
	void setQuantity(int quanitity) {
		this.qty= quanitity;
	}
		
	}