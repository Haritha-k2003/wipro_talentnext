import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] word=s.split(" ");
		if(word.length==0) {
			System.out.print("No Value");
		}
		for(int i=0;i<word.length;i++) {
			 System.out.print(word[i]);
			 if(i<word.length-1) {
				 System.out.print(",");
			 }
		}

	}

}
