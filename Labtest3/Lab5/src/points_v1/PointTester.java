package points_v1;

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



	}
}
