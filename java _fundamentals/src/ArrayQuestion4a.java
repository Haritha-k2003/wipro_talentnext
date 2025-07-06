import java.util.Scanner;
public class ArrayQuestion4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int[] arr = new int[n];
 // Input array elements
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Initialize largest and second largest
		        int largest = Integer.MIN_VALUE;
		        int secondLargest = Integer.MIN_VALUE;
		        int smallest=Integer.MAX_VALUE;
		        int secondsmallest=Integer.MAX_VALUE;

		        // Find largest and second largest in one pass
		        for (int i = 0; i < n; i++) {
		            if (arr[i] > largest) {
		                secondLargest = largest; // Update second largest
		                largest = arr[i];        // Update largest
		            } else if (arr[i] > secondLargest && arr[i] != largest) {
		                secondLargest = arr[i];
		            }
		        } for (int i = 0; i < n; i++) {
		            if (arr[i] < smallest) {
		                secondsmallest = smallest; // Update second largest
		                smallest = arr[i];        // Update largest
		            } else if (arr[i] > secondsmallest && arr[i] != smallest) {
		                secondsmallest = arr[i];
		            }
		        }
		        

		        System.out.println("Largest: " + largest);
		        System.out.println("Second Largest: " + secondLargest);
		        System.out.println("Smallest: " + smallest);
		        System.out.println("Secondsmallest: " + secondsmallest);
		    }
		

	

}
