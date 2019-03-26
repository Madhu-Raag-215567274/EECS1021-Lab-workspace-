package Points_v2;

public class PointTester {

	public static void main(String[] args) {
		point p1= new point(3,-4) ;
		point p2 = new point(-2,7);
		point p3 = new point('y',8);
		point p4 = new point('x',-5);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 and p2 store different address "+ (p1!=p2));
		System.out.println("p1 and p2 store same address "+ (p1==p2));
		System.out.println(p3);
		System.out.println(p4);
		

		String desc1 =  p1.getDescription();
		String desc2 =  p3.getDescription();
		
		double dist1= p1.getDistanceFromOrigin();
		double dist2 = p3.getDistanceFromOrigin();
		
		double dist3 = p1.getDistanceFrom(p3);
		
		System.out.println("Description of p1: " + desc1);
		System.out.println("Description of p3: " + desc2);
		System.out.println("Description of p1 from (0,0): " + dist1);
		System.out.println("Description of p1 from (0,0): " + dist2);
		System.out.println("Description from  p1 to p3: " + dist3);

		p1.move('R', 3.2);
		p3.move('D',4.7);
		System.out.println("After moving p1 and p3");
		
		desc1 =  p1.getDescription();
		desc2 =  p3.getDescription();		
		dist1= p1.getDistanceFromOrigin();
	    dist2 = p3.getDistanceFromOrigin();
		dist3 = p1.getDistanceFrom(p3);		
		System.out.println("Description of p1: " + desc1);
		System.out.println("Description of p3: " + desc2);
		System.out.println("Description of p1 from (0,0): " + dist1);
		System.out.println("Description of p1 from (0,0): " + dist2);
		System.out.println("Description from  p1 to p3: " + dist3);

	
		


		
	


	}
}
