import java.util.Random;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice() {
	return "First Class Compartment";
}
}
class Ladies extends Compartment{
	public String notice() {
		return "Ladies Compartment";
	}
}
class General extends Compartment{
	public String notice() {
		return "General Compartment";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "Luggage Copartment";
	}
}
public class TestCompartment {
	public static void main(String[] args) {
		Compartment[] compartments=new Compartment[10];
		Random rand=new Random();
		int n=compartments.length;
		for(int i=0;i<n;i++) {
			int type=rand.nextInt(4)+1;
			switch(type) {
			case 1:
				compartments[i]=new FirstClass();
				break;
			case 2:
				compartments[i]=new Ladies();
				break;
			case 3:
				compartments[i]=new General();
				break;
			case 4:
				compartments[i]=new Luggage();
				break;
				
			}
			
		}
		System.out.println("Compartment Notice: ");
			for(int i=0;i<n;i++) {
				System.out.println("Compartment " + (i+1) + ": " + compartments[i].notice());
				
			}

	}

}
