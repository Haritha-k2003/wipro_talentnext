import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		
		Arrays.sort(arr);
		System.out.println("Largest numbers: " +arr[n-1]+ " " +arr[n-2]);
		System.out.println("Smallest numbers: "+arr[0]+ " " + arr[1]);
		}
	

}
