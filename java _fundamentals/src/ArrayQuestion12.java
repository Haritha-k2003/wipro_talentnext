import java.util.Scanner;

public class ArrayQuestion12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
	        
	         }
		         for(int j=0;j<n;j++) {
		        	 arr2[j]=sc.nextInt();
		        	 
		}
		         int mid1=n/2;
		         int mid2=n/2;
		        System.out.print(arr1[mid1] + " ");
		        System.out.println(arr2[mid2]);
	}

}
