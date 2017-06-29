class Area {
	public static void main(String args[]){
		double length=2,breadth=3,r=4.5,a=2;

		Area area = new Area();
		length=area.circle(r);

		System.out.println("Area of a circle:"+ area.circle(r));
		System.out.println("Area of a rectangle:"+(length*breadth));
		System.out.println("Area of a triangle:" + (0.5*length*a));

	}

	public double circle(double radius){
		return 3.14 * Math.pow(radius, 2);
	}
	public double rectangle(double length, double breadth){
		return length*breadth;
	}
	public double triangle(double length, double a){
		return length*a*0.5;
	}
}