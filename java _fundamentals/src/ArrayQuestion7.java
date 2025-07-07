import java.util.Scanner;

public class ArrayQuestion7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			boolean isDuplicate=false;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.println(arr[i]);
			}
		}
		

	}

}
