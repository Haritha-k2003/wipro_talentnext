import java.util.Scanner;

public class ArrayQuestion10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i] + " ");;
			}
		}
		for(int i=0;i<n;i++) {
		if(arr[i]%2!=0) {
			System.out.print(arr[i] + " ");
		}
			
		}

	}

}
