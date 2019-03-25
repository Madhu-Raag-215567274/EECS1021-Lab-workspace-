class Shop { 
	private Member[] members;
	private int nom; /* number of members */
	
	Shop() {
		members = new Member[100];
		nom = 0; /* optional */
	}
	
	void addMember(Member m) {
		members[nom] = m;
		nom ++;
	}
	
	Member[] getMembers() {
		Member[] ms = new Member[nom];
		for(int i = 0; i < nom; i ++) {
			ms[i] = members[i];
		}
		return ms;
	}
	
	private int indexOfMember(String id) {
		int index = -1;
		for(int i = 0; i < nom; i ++) {
			if(members[i].getId().equals(id)) {
				index = i;
			}
		}
		return index;
	}
	
	
	boolean hasMember(String id) {
		return indexOfMember(id) >= 0;
	}
	
	void checkOut(String id) {
		int index = indexOfMember(id);
		if(index >= 0) {
			Member m = members[index];
			double amount = m.getAmountToPay();
			m.withdraw(amount);
			m.clearOrders();
		}
		else {
			/* non-existing member: do nothing */
		}
	}
}
