import java.util.Scanner;

public class ArrayQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		int average=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
			System.out.println("sum: " + sum);
			
		}average=(sum)/n;
		System.out.println("average: " + average);

	}

}
