class Order {
	String product;
	double price;
	int quan ;	 


	Order(String product, double price, int quan) {
		this.product= product;
		this.price = price;
		this.quan= quan;
	}


	Order() {


	}


	String getProduct() {



		return this.product;
	}


	double getPrice() {


		return this.price;
	}

	int getQuantity() {

		return this.quan;
	}


	void setProduct(String string) {
		this.product= string;

	}


	void setPrice(double d) {
		this.price=d;	
	}

	void setQuantity(int i) {
		this.quan=i;		
	}


}