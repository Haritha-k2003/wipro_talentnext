import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start-1;i<end;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
