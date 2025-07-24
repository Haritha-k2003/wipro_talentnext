import java.util.Scanner;

public class Box {
	double width;
	double height;
	double depth;
	public Box(double w,double h,double d) {
		width=w;
		height=h;
		depth=d;
	}
		public double Volume() {
			return width*height*depth;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		double d=sc.nextDouble();
		Box myBox=new Box(w,h,d);
		System.out.println(myBox.Volume());

	}

}
