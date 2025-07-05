import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String gender=sc.next();
		int age=sc.nextInt();
		if(gender.equalsIgnoreCase("female") && age>1 && age<58) {
			System.out.print("Percentage of Interest is 8.2%.");
		}else if(gender.equalsIgnoreCase("female") && age>59 && age<100) {
			System.out.print("Percentage of Interest is 9.2.");
		}else if(gender.equalsIgnoreCase("male") && age>1 && age<58) {
			System.out.print("Percentage of Interest is 8.4%.");
		}else if(gender.equalsIgnoreCase("male") && age>59 && age<100) {
			System.out.print("Percentage of Interest is 10.5%.");
		}
	}

}
