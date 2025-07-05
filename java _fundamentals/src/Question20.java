import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original =n;
		int reverse =0;
		while(n!=0) {
			int digit=n%10;
		     reverse=(reverse * 10)+digit;
			n=n/10;
		}
		if(original==reverse) {
			System.out.println(original +" is a palindrome.");
		}else {
			System.out.println(original + " is not a palindrome. ");
		}

	}

}
