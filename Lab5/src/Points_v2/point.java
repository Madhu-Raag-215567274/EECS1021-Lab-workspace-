package Points_v2;

public class point {
	double x;
	double y;

	point(double x, double y){
		this.x =x;
		this.y= y;

	}
	point (char axis, double distance){
		if(axis=='x') {
			this.x=distance;
			this.y=0;
		}
		else {
			this.x=0;
			this.y=distance;
		}
	}

	double getDistanceFromOrigin() {
		double result =0.0;


		result =Math.sqrt(this.x*this.x + Math.pow(this.y,2));
		return result;
	}
	
	String getDescription() {
		String description ="";
		description= "(" + this.x+ ","+ this.y+ ")";
		return description;
	}
	
	double getDistanceFrom(point other) {
		double distance= 0.0;
		
		 distance = Math.sqrt(
				 Math.pow(this.x-other.x, 2))+
				 Math.pow(this.y-other.y, 2);
		return distance;
	}
	
	void move(char direction, double units) {
		if (direction=='U') {
			this.y= this.y-units;		
			
		}
		else if  (direction=='D') {
			this.y=this.y-units;
		}
		else if (direction=='L') {
			this.x= this.x -units;
		}
		else {
			this.x=this.x+units; 
		}
		
	}
}

