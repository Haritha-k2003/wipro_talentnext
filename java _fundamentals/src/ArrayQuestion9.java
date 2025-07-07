import java.util.Scanner;

public class ArrayQuestion9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int index=0;
		for(int i=0;i<n;i++){
			if(arr[i]!=10) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<n) {
			arr[index]=0;
			index++;
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}
	

}
