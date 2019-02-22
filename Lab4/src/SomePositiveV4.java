
public class SomePositiveV4 {
	/*
	 * V1: scan the entire array (i.e., stay condition is i < ns.length),
	 * 		and with accumulation (i.e., somePos = somePos || ns[i] > 0). Works.
	 * V2: scan the entire array (i.e., stay condition is i < ns.length),
	 * 		and without accumulation (i.e., somePos = ns[i] > 0). Does not work (depends on the last element).
	 * V3: may exit early (i.e., stay condition is i < ns.length && !somePos),
	 * 		and with accumulation (i.e., somePos = somePos || ns[i] > 0). Works.
	 * V4: may exit early (i.e., stay condition is i < ns.length && !somePos),
	 * 		and without accumulation (i.e., somePos = ns[i] > 0). Works.
	 */
	public static void main(String[] args) {
		int[] ns = {-2,-3,1,-4,5};
		boolean somePos = false;
		// early exit when possible
		for(int i =0; i<ns.length&& !somePos; i++) {
		somePos= ns[i]>0;
		}
		System.out.println(" Some elements in the array are positve: "+ somePos);
	}

}
