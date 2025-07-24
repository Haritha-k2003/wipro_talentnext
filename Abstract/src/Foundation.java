
public class Foundation {
		private int val1=10;
		int val2=20;
		protected int val3=30;
		public int val4=40;
		public void displayInside() {
			System.out.println("Inside Foundation class: ");
			System.out.println("val1: "+val1);
			System.out.println("val2: "+val2);
			System.out.println("val3: "+val3);
			System.out.println("val4: " + val4);
			

	}

}

class MainClass{
public static void main(String[] args) {
	Foundation obj=new Foundation();
	System.out.println("Accesing from MainClass");
	System.out.println("val4: " + obj.val4);
	obj.displayInside();
}
}
