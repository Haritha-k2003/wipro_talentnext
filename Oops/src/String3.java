import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        if(n>2){
            String firstTwo=str.substring(0,2);
            StringBuffer result=new StringBuffer();
            for(int i=0;i<n;i++){
                result.append(firstTwo);
            }
            System.out.println("output: "+result.toString());
        }
    }
}