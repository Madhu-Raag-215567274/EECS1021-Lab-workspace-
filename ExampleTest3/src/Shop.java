
public class Shop {
	
	Member[] mem;
	int nom=0;
	
	
	Shop(){
		this.mem = new Member[30];
	}

	Member[] getMembers() {
		Member [] num= new Member[nom];
		for(int i =0; i<num.length;i++) {
			num[i]=this.mem[i];			
		}		
		
	
		return num;
	}

	void addMember(Member mem) {
	
		this.mem[nom]=mem;
		
		nom++;
	}

	boolean hasMember(String id) {
		boolean result =false;
		
		for(int i =0; i<nom; i++) {
			if(this.mem[i].getId()== id) {
				result =true;
				
			}
		}
		
		
		return result;
	}

	void checkOut(String id) {
		for(int i=0; i<nom;i++) {
			if(this.mem[i].getId().equals(id) ) {				
				 this.mem[i].withdraw(this.mem[i].amtpay);
			}
		}
		
			
	}

}
