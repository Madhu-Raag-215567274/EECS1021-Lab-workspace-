
public class SomePositiveV2 {

	public static void main(String[] args) {
		int[] ns = {-2,-3,-1,-4,-15};
		boolean somePos = false;
		for(int i =0; i<ns.length; i++) {
			somePos=  ns[i]>0;
			// wrong version without accumulation
		}
		System.out.println(" Some elements in the array are positve: "+ somePos);
	}

}
