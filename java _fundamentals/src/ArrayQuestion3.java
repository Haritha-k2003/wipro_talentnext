import java.util.Scanner;

public class ArrayQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int search=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				System.out.print(i);
				return;
			}
			
			}
		System.out.println(-1);
	
	}

}
