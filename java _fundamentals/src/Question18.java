import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.trim().isEmpty()) {
            System.out.println("Please enter the Integer Number");
        } else {
            int n = Integer.parseInt(s);

            for (int i = 1; i <= n; i++) { 
                for (int j = 1; j <= i; j++) { 
                    System.out.print(" * "); 
                }
                System.out.println(); 
            }
        }
    }
}
