import java.util.*;
public class Calculator {
 
	public static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,double num2) {
		return (double)Math.pow(num1,num2);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int intbase=sc.nextInt();
		int intexponent=sc.nextInt();
		int result1=Calculator.powerInt( intbase, intexponent);
		System.out.print(result1);
		double doublebase=sc.nextDouble();
		double doubleexponent=sc.nextDouble();
		double result2=Calculator.powerDouble(doublebase, doubleexponent);
		System.out.println(result2);
		

	}

}
