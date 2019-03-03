package DataStructures;

public class Animal {
	
	public static final String CAT = "cat";
	public static final String DOG = "dog";
	
	String name;
	String type;

	public Animal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
