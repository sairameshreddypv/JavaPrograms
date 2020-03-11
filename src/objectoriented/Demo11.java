package objectoriented;

// Predict the output
public class Demo11 {
	
	public static void main(String[] args) {
		new Demo11().go();
	}
	void go(){
		Mammal m = new Zerba();
		System.out.println(m.name+""+m.makeNoise());
	}

}
class Mammal {
	String name = "furry";
	String makeNoise(){
		return "Generic Noise";
	}
}
class Zerba extends Mammal {
	String name = "stripes";
	String makeNoise(){
		return "Bray";
	}
}

// Answer -   furryBray
