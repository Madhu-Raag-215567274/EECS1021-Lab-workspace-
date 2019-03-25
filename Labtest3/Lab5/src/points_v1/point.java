package points_v1;

public class point {
	double x;
	double y;

	point(double newX, double newY){
		x=newX;
		y= newY;

	}
	point (char axis, double distance){
		if(axis=='x') {
			x=distance;
			y=0;
		}
		else {
			x=0;
			y=distance;
		}
	}
}
