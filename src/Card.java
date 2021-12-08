import java.util.Objects;

public class Card {

	private String name;
	private String value;
	private int point;
	
	public Card(String newName, String newValue, int newPoint) {
		this.setName(newName);
		this.setValue(newValue);
		this.setPoint(newPoint);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[ " + name + " , " + value + " , " + point + " ]";
	}


	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(name, other.name) && Objects.equals(value, other.value) && Objects.equals(point, other.point);
	}
	
	
	
	
	

	

}
