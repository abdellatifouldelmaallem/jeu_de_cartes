

public class Card {

	private String name;
	private String value;
	
	public Card(String newName, String newValue) {
		this.setName(newName);
		this.setValue(newValue);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[ " + name + " , " + value +" ]";
	}


	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	

}
