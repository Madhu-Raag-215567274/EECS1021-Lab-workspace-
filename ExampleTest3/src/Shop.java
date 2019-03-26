public class Shop {
	
	Member[] shop;
	int nom;

	Shop(){
		this.shop = new Member [30];
	}

	Member[] getMembers() {
		Member[] num = new Member[nom];
		for(int i=0; i<num.length; i++) {
			num [i] = this.shop[i];

		}



		return num;
	}

	boolean hasMember(String id) {
		boolean result=false;

		for(int i =0 ; i< this.nom;i++) {
			if(this.shop[i].getId().equals(id)) {
				result =true;
			}
		}


		return result;
	}

	 void addMember(Member alan) {
       this.shop[nom]= alan;		
       nom++;
	}

	void checkOut(String id) {	

		for(int i =0 ; i< this.nom;i++) {
			if(this.shop[i].getId().equals(id)) {
				this.shop[i].bla =this.shop[i].bla -this.shop[i].getAmountToPay();
				
			}
			
			
			
		}
		
	
	}




}