import  java.util.*;
public class Question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res1=a % 10;
		int res2=b % 10;
		if(res1 == res2) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}
	}

}
