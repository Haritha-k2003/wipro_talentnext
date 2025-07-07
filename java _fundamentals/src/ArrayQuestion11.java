import java.util.Scanner;

public class ArrayQuestion11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==1 || arr[i]==4) {
				found=true;
				break;
			}
			
		}
		if(found) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
