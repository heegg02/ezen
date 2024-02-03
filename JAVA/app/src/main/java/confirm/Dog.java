package confirm;

public class Dog implements Soundable {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String sound() {
		return "멍";
	}

}
